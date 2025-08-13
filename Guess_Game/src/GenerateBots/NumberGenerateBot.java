package GenerateBots;

import Interfaces.IGenerateBot;

import java.util.Random;
import java.util.Scanner;

public class NumberGenerateBot implements IGenerateBot {
    int content;
    Scanner sc;
    private int tries;

    public NumberGenerateBot(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public void setTries(int tries) {
        this.tries = tries;
    }

    @Override
    public void play() {
        System.out.println("What is maximum number I may choose?");
        int max = Integer.parseInt(sc.nextLine()); // Used this method to prevent extra nextLine calls
        this.content = new Random().nextInt(max);
        int currentTry = 1;
        boolean guessed = false;
        while (currentTry <= tries && !guessed) {
            System.out.println("Try " + currentTry + ":");
            guessed = checkAnswer(sc.nextLine());
            currentTry++;
        }

        if (!guessed) {
            System.out.printf("The correct answer was %d. Try again!%n", content);
        }
        sc.close();
    }

    private boolean checkAnswer(String answer) {
        int intAnswer = Integer.parseInt(answer); // In this case, make it an int
        if (intAnswer < content) {
            System.out.println("My number is larger!");
            return false;
        } else if (intAnswer > content) {
            System.out.println("My number is smaller!");
            return false;
        } else {
            System.out.println("You guessed it correctly!");
            return true;
        }
    }
}