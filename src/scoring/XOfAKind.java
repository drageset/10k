package scoring;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class XOfAKind implements ScoreRule{
    int score = 100;

    public XOfAKind() {}

    public XOfAKind(int score) {
        this.score = score;
    }

    @Override
    public int calculate(int[] diceBag) {
        Map<Integer, Integer> counterMap = new HashMap<>();
        for (int dice : diceBag) {
            counterMap.merge(dice, 1, Integer::sum);
        }
        Set<Integer> keySet = counterMap.keySet();
        int finalScore = 0;
        for (Integer key : keySet) {
            int value = counterMap.get(key);
            if (value >= 3) {
                int addedScore = key * score * (value - 2);
                if (key == 1)
                    addedScore *= 10;
                finalScore += addedScore;
            }
        }
        return finalScore;
    }
}
