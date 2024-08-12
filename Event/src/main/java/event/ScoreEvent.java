package event;

/**
 *
 * @author gbru
 */
public class ScoreEvent {
    private final Score scoreValue;
    
    public ScoreEvent(Object source, int scoreTeam1, int scoreTeam2){
        super();
        scoreValue = new Score(scoreTeam1, scoreTeam2);
    }

    public Score getScoreValue(){
        return scoreValue;
    }
}