package scoring;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ThreePairs implements ScoreRule{

    int score = 100;

    public ThreePairs() {}

    public ThreePairs(int score) {
        this.score = score;
    }

    @Override
    public int calculate(int[] diceBag) {
        Map<Integer, Integer> counterMap = new HashMap<>();
        for (int dice : diceBag) {
            counterMap.merge(dice, 1, Integer::sum);
        }
        Set<Integer> keySet = counterMap.keySet();
        int pairCounter = 0;
        int finalScore = 0;
        for (Integer key : keySet) {
            int value = counterMap.get(key);
            while (value >= 2) {
                pairCounter++;
                finalScore += key * score;
                value -= 2;
            }
        }
        if (pairCounter >= 3)
            return finalScore;
        return 0;
    }
}
