package Model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Move> moves;
    private List<Player> players;
    private List<WinningStrategy> winningStrategy;
    private Board board;
    private GameStatus gameStatus;
    private Player winner;

    public Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategy){
        this.moves = new ArrayList<>();
        this.board = new Board(dimension);
        this.players=players;
        this.winningStrategy=winningStrategy;
        this.gameStatus=GameStatus.IN_PROGRESS;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setWinningStrategy(List<WinningStrategy> winningStrategy) {
        this.winningStrategy = winningStrategy;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<WinningStrategy> getWinningStrategy() {
        return winningStrategy;
    }

    public Board getBoard() {
        return board;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Player getWinner() {
        return winner;
    }
}
