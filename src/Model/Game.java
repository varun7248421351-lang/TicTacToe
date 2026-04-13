package Model;

import java.util.List;

public class Game {
    private List<Move> Moves;
    private List<Player> Player;
    private List<WinningStrategy> winningStrategy;
    private Board Board;

    public Game(){

    }

    public void setMoves(List<Move> moves) {
        Moves = moves;
    }

    public void setPlayer(List<Player> player) {
        Player = player;
    }

    public void setWinningStrategy(List<WinningStrategy> winningStrategy) {
        this.winningStrategy = winningStrategy;
    }

    public void setBoard(Board board) {
        Board = board;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public List<WinningStrategy> getWinningStrategy() {
        return winningStrategy;
    }

    public List<Player> getPlayer() {
        return Player;
    }

    public List<Move> getMoves() {
        return Moves;
    }

    public Board getBoard() {
        return Board;
    }

    private Player winner;
    private GameStatus gameStatus;
}
