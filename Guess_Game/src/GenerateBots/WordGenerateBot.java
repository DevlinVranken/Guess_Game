package GenerateBots;

import Interfaces.IGenerateBot;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class WordGenerateBot implements IGenerateBot {

    private int tries;

    String[] possibleWords = new String[]{"Hello", "World", "How", "Are", "You", "Doing", "I", "Am", "Doing", "Great!"};
    String content;
    Scanner sc;

    public WordGenerateBot(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public void setTries(int tries) {
        this.tries = tries;
    }

    @Override
    public void play() {
        content = possibleWords[(int) (Math.random() * possibleWords.length)];
        System.out.println("The possible words to guess are the following:");
        System.out.println(Arrays.toString(possibleWords));

        int currentTry = 1;
        boolean guessed = false;
        while (currentTry <= tries && !guessed) {
            System.out.println("Try " + currentTry + ":");
            guessed = checkAnswer(sc.nextLine());
            currentTry++;
        }
    }

    private boolean checkAnswer(String answer) {
        if (Objects.equals(answer, content)) {
            System.out.println("You guessed the correct word!");
            return true;
        }
        return false;
    }
}