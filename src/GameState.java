import java.util.ArrayList;
import java.util.List;

public class GameState {

    List<Player> playerOrderList;
    List<Player> winners = new ArrayList<>();
    int currentPlayerIndex = 0;

    int turnScore = 0;
    int lockedDice = 0;
    int freeDice = 6;

    public GameState(List<Player> playerOrderList){
        this.playerOrderList = playerOrderList;
    }

    public GameState(List<Player> playerOrderList, int currentPlayerIndex){
        this.playerOrderList = playerOrderList;
        this.currentPlayerIndex = currentPlayerIndex;
    }

    public void next(){
        if (!winners.isEmpty())
            throw new IllegalStateException("Can not call next when winners have been decided!");
        currentPlayerIndex++;
        if (currentPlayerIndex == playerOrderList.size()) {
            currentPlayerIndex = 0;
            for (Player player : playerOrderList) {
                if (player.getScore() > 10000)
                    if (!winners.isEmpty())
                        if (player.getScore() < winners.get(0).getScore()) {
                            winners = new ArrayList<>();
                        }
                winners.add(player);
            }
        }

        if (!gameOver()){
            playerOrderList.get(currentPlayerIndex).turn(this);
        }
    }

    boolean gameOver(){
        return !winners.isEmpty();
    }

    List<Player> getWinners(){
        return winners;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Turn Score: ").append(turnScore).append("\n");
        builder.append("Locked Dice: ").append(lockedDice).append("\n");
        builder.append("Free dice: ").append(freeDice).append("\n");
        for (Player player : playerOrderList) {
            builder.append("Player '").append(player.getId()).append("' score: ").append(player.getScore()).append("\n");
        }
        return builder.toString();
    }
}
