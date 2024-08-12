package event;

/**
 *
 * @author gbru
 */
public class Score {
    private final int thScore;
    private final int uaeScore;

    public Score(int thScore, int uaeScore) {
        this.thScore = thScore;
        this.uaeScore = uaeScore;
    }

    public int getTHScore() {
        return thScore;
    }

    public int getUAEScore() {
        return uaeScore;
    }
}