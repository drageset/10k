import java.util.ArrayList;
import java.util.List;

public class Game {

    GameState gameState;

    // General Game State
    List<Player> playerOrderList;
    List<Player> winners = new ArrayList<>();
    int currentPlayerIndex = 0;

    // Turn State
    int turnScore = 0;
    int lockedDice = 0;
    int freeDice = 6;


    public Game(List<Player> playerOrderList) {
        gameState = new GameState(playerOrderList);
    }

    public Game(List<Player> playerOrderList, int currentPlayerIndex) {
        gameState = new GameState(playerOrderList, currentPlayerIndex);
    }

    public void next(){

    }

}
