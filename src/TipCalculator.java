import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
public class TipCalculator {
    public static void main(String[] args) {
        //my scanner for taking in user input
        Scanner scan = new Scanner(System.in);
        //this class will help me round and format the final values into dollars and cents
        DecimalFormat formatter = new DecimalFormat("#.##");
        //this ArrayList is for holding the price of each item later on
        ArrayList<Double> items = new ArrayList<Double>();
        //welcoming the user
        System.out.println("Welcome to the tip calculator!");
        //saving # of people in the group as a variable
        System.out.println("How many people are in your group?");
        int people = scan.nextInt();
        //saving preferred tip percentage as an integer
        System.out.println("Enter the tip percentage as an integer.");
        int percent = scan.nextInt();
        /* this is the while loop, so as the user inputs the price of each item they ordered,
        the loop checks to see whether the item is equal to -1 and if it isn't then the item is added to
        the ArrayList (items), but if it is then the loop ends */
        System.out.println("Enter the cost of each item in dollars and cents, (type -1 when finished).");
        double n;
        while ((n = scan.nextDouble()) != -1) {
            items.add(n);
        }

        /* I created the variable of initialBill and made a loop that adds every item from my ArrayList
        to the initialBill to create the total bill sum */
        double initialBill = 0;
        for (Double i : items) {
           initialBill += i;
        }

        //calculations
        /* this calculates the tip amount separately by multiplying the bill
        amount by the tip percentage then dividing by 100 */
        double tipAmt = (initialBill*percent) / 100;
        //this is creating the bill amt plus tip, but as a double
        double finalBill = initialBill + tipAmt;
        //this formats the bill amount per person without tip
        String ibPerPerson = formatter.format(initialBill / people);
        //this formats the bill amount per person with tip
        String fbPerPerson = formatter.format(finalBill / people);
        //this formats the tip amount per person
        String tipPerPerson = formatter.format(tipAmt / people);

        //printing everything out
        System.out.println("-------------------");
        System.out.println("Total bill before tip: $" + initialBill);
        System.out.println("Tip percentage: " + percent + "%");
        System.out.println("Total tip: $" + tipAmt);
        System.out.println("Total bill with tip: $" + finalBill);
        System.out.println("Per person cost before tip: $" + ibPerPerson);
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Total cost per person: $" + fbPerPerson);
        System.out.println("-------------------");
    }

}
