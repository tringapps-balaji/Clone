package clone;
import org.example.CloneCall;
import java.util.Scanner;
import java.util.logging.Logger;
public class CloneMain {
    public static void main(String []args) throws CloneNotSupportedException {
            Scanner sc = new Scanner(System.in);
            Logger lg = Logger.getLogger("Clone");

               lg.info(" Enter 1st Coordinates  \n");
               lg.info("\n Enter a value  : ");
                int x = sc.nextInt();
                lg.info(" Enter b value  : ");
                int y = sc.nextInt();

                CloneCall obj = new CloneCall(x,y);
                CloneCall obj1 = (CloneCall) obj.clone();

                lg.info("\n Enter 2nd Coordinates  \n");
                lg.info("\n Enter a value : ");
                int x1 = sc.nextInt();
                lg.info(" Enter b value : ");
                int y1 = sc.nextInt();
                CloneCall obj2 = new CloneCall(x1,y1);
                if(obj1.equals(x1,y1))
                {
                    lg.info("Both Are Equal ...");
                }
                else
                {
                    lg.info("Both Are Not Equal ...");
                }
    }
}

