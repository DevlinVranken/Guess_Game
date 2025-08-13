import Interfaces.IGenerateBot;

public class GuessGame {
    IGenerateBot bot;

    public GuessGame(IGenerateBot bot) {
        this.bot = bot;
    }

    public void introduction() {
        this.bot.play();
    }
}
