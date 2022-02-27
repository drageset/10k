package scoring;

public class Ones implements ScoreRule{

    int score = 100;

    public Ones() {}

    public Ones(int score) {
        this.score = score;
    }

    @Override
    public int calculate(int[] diceBag) {
        int counter = 0;
        for (int i : diceBag) {
            if (i == 1)
                counter++;
        }
        return counter * score;
    }
}
