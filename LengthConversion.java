//import Scanner as we require it.
import java.util.Scanner;
 
// the name of our class its public
public class LengthConversion {
    //void main
        public static void main (String[] args)
        {
            //declare float
            float a,b;
            //print message
            System.out.println("Enter Length in meter:");
            //Take input
            Scanner input = new Scanner(System.in);
            //calculate
             b = input.nextFloat();
             a = b*100;
            //print the average
            System.out.println("Length in centimeter = "+a);
        }
}