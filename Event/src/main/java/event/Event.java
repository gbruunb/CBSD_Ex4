package event;

/**
 *
 * @author gbru
 */
import java.util.Scanner;

public class Event {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            
            ScoreSource source = new ScoreSource();
            Subscriber subscriber1 = new Subscriber();
            Subscriber subscriber2 = new Subscriber();

            source.addSubscriber(subscriber1);
            source.addSubscriber(subscriber2);

            while (true) {
                System.out.print("Enter Score Thai: ");
                Integer thaiScore = Integer.parseInt(sc.nextLine());
                if (thaiScore == null) break;
                
                System.out.print("Enter Score UAE: ");
                Integer uaeScore = Integer.parseInt(sc.nextLine());;
                if (uaeScore == null) break;

                source.setScoreLine(thaiScore, uaeScore);
            }

        } catch (NumberFormatException e) {
            
        }
    }
}
