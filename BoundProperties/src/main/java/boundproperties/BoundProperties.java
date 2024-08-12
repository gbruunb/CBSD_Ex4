package boundproperties;

/**
 *
 * @author gbru
 */
import java.util.Scanner;
public class BoundProperties {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean liveScore = new LiveScoreBean();
        Subscriber subscriber1 = new Subscriber();
        Subscriber subscriber2 = new Subscriber();
        
        liveScore.addSubscripber(subscriber1);
        liveScore.addSubscripber(subscriber2);
        
        try(Scanner sc = new Scanner(System.in)){
            while (true) {
                System.out.print("Enter Score Thai: ");
                Integer thaiScore = Integer.parseInt(sc.nextLine());
                if (thaiScore == null) break;

                System.out.print("Enter Score UAE: ");
                Integer uaeScore = Integer.parseInt(sc.nextLine());;
                if (uaeScore == null) break;

                liveScore.setScoreLineProperty(thaiScore, uaeScore);
            }
        }catch(NumberFormatException e){
        
        }
    }
    
}
