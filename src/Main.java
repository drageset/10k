import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("*** 10k ***");
        System.out.println("New Game:");
        List<Player> playerList = new ArrayList<>();

        // Player Setup
        while (true){
            System.out.println("Add a new player to game?");
            if (playerList.size() > 1)
                System.out.println("0 - No, we're ready to play!");
            System.out.println("1 - Add human player");
            System.out.println("2 - Add AI player");
            try {
                int newPlayerInput = reader.read();
                if (newPlayerInput == 1){
                    System.out.println("New human player name:");
                    String newPlayerName = reader.readLine();
                    playerList.add(new HumanPlayer(newPlayerName));
                } else if (newPlayerInput == 2) {
                    System.out.println("AI player not implemented");
                } else if (newPlayerInput == 0 && playerList.size() > 1) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
