public abstract class Player {

    String id;
    int currentScore = 0;

    public Player(String id) {
        this.id = id;
    }

    public Player(String id, int currentScore) {
        this.id = id;
        this.currentScore = currentScore;
    }

    public String getId() {
        return id;
    }

    public void setId(String identifier) {
        this.id = identifier;
    }

    public int getScore() {
        return currentScore;
    }

    public void setScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public void addScore(int score) {
        this.currentScore += score;
    }

    abstract Action turn(GameState state);
}
