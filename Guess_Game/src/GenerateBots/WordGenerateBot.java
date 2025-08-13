package GenerateBots;

import Interfaces.IGenerateBot;

import java.util.Scanner;

public class WordGenerateBot implements IGenerateBot {

    String content;
    Scanner sc;

    public WordGenerateBot(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public void play() {}

    @Override
    public boolean checkAnswer(String answer) {
        return false;
    }
}
