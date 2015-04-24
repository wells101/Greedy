import java.util.Scanner;

/**
 * Created by Gaming on 4/22/2015.
 */
public class Greedy {
    public static void main(String[] varArgs) {
        String myString;
        Scanner myScanner = new Scanner(System.in);
        do {
            System.out.println("Enter Amount in Euro or Dollars in format $X.XX: ");
            myString = myScanner.nextLine();
        }while(!(myString.substring(0,0).matches("€") || myString.substring(0,0).matches("$")));
        CoinCalculator myCalc = new CoinCalculator();
        System.out.println("The fewest possible coins used is: " + myCalc.processChange(myString));
    }

}
