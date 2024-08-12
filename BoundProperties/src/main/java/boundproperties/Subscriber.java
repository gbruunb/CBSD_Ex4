package boundproperties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
/**
 *
 * @author gbru
 */
public class Subscriber implements PropertyChangeListener{

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("live result: " + evt.getNewValue()); 
    }
    
}
