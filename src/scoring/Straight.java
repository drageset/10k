package scoring;

public class Straight implements ScoreRule {

    int score = 3000;

    public Straight() {}

    public Straight(int score) {
        this.score = score;
    }

    @Override
    public int calculate(int[] diceBag) {
        for (int i = 1; i <= diceBag.length; i++) {
            boolean isPresent = false;
            for (int dice : diceBag) {
                if (dice == i)
                    isPresent = true;
            }
            if (!isPresent)
                return 0;
        }
        return score;
    }
}
