import GenerateBots.NumberGenerateBot;
import GenerateBots.WordGenerateBot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mode = 0;
        GuessGame game = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Guess Game!");
        while (mode < 1 || mode > 2) {
            System.out.println("Press 1 to guess a number or 2 to guess a word!");
            mode = Integer.parseInt(input.nextLine()); // Used this method to prevent extra nextLine calls
            if (mode == 1) {
                game = new GuessGame(new NumberGenerateBot(input));
            } else if (mode == 2) {
                game = new GuessGame(new WordGenerateBot(input));
            } else {
                System.out.println("Not a valid mode!");
            }

            if (game != null) {
                game.introduction();
            }
        }
    }
}