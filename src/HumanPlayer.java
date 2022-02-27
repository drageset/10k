import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HumanPlayer extends Player{
    public HumanPlayer(String id) {
        super(id);
    }

    @Override
    Action turn(GameState state) {
        System.out.println("It's your turn "+id+"!");
        System.out.println(state);
        int choice = -1;
        while (choice != 0 && choice != 1){
            System.out.println("*** MAKE YOUR CHOICE ***");
            System.out.println("0 - PASS");
            System.out.println("1 - ROLL");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            try {
                choice = reader.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return switch (choice) {
            case 0 -> Action.PASS;
            case 1 -> Action.ROLL;
            default -> null;
        };
    }

}
