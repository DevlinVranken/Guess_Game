import Interfaces.IGenerateBot;

import java.util.Scanner;

public class GuessGame {
    IGenerateBot bot;
    Scanner sc;

    public GuessGame(IGenerateBot bot, Scanner sc) {
        this.bot = bot;
        this.sc = sc;
    }

    public void introduction() {
        System.out.println("What is the number of tries you would like to guess?");
        int tries = Integer.parseInt(sc.nextLine()); // Used this method to prevent extra nextLine calls
        bot.setTries(tries);
        this.bot.play();
    }
}
