package scoring;

public class Fives implements ScoreRule {

    int score = 50;

    public Fives() {}

    public Fives(int score) {
        this.score = score;
    }

    @Override
    public int calculate(int[] diceBag) {
        int counter = 0;
        for (int i : diceBag) {
            if (i == 5)
                counter++;
        }
        return counter * score;
    }
}
