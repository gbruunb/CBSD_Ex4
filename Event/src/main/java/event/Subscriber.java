package event;

/**
 *
 * @author gbru
 */
public class Subscriber implements ScoreListener{
    @Override
    public void scoreChange(ScoreEvent se) {
        System.out.println("live result: Thai " + se.getScoreValue().getTHScore() + "-" + se.getScoreValue().getUAEScore() + " UAE");
    }
    
}