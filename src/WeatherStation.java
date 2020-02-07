import java.util.Scanner;
import java.util.ArrayList;
public class WeatherStation {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> c = new ArrayList<Double>();
        ArrayList<Double> f = new ArrayList<Double>();
        int x = 1;
    while (x < 6) {
            String b = "C";
            String reading = input.next();
            System.out.println("You entered " + reading);
            System.out.println("You entered " + reading.substring(2, 3));
            if (reading.substring(2, 3) == "C"){
                double d = Double.parseDouble(reading.substring(0,2));
                c.add(d);
                x = x + 1;
            }
        else if (reading.substring(2, 3) == "F"){
            double d = Double.parseDouble(reading.substring(0,2));
            f.add(d);
            x = x + 1;
        }
        else{
                System.out.println("Wrong letter try again");
            }
        }
        System.out.println(c);
        System.out.println(f);
        System.out.println("END");
    }
}





