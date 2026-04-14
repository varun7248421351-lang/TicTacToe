package Model;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(Symbol symbol, String name) {
        super(symbol, name, PlayerType.BOT);
    }
}
