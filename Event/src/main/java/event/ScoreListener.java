package event;

/**
 *
 * @author gbru
 */
import java.util.EventListener;

public interface ScoreListener extends EventListener {
    public void scoreChange(ScoreEvent se);
}