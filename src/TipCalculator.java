import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        ArrayList<Double> items = new ArrayList<Double>();
        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group?");
        int people = scan.nextInt();
        System.out.println("Enter the tip percentage as an integer.");
        int percent = scan.nextInt();
        System.out.println("Enter a cost in dollars and cents, (-1 to end).");
        double n;
        while ((n = scan.nextDouble()) != -1) {
            items.add(n);
        }
        double initialBill = 0;
        for (Double i : items) {
           initialBill += i;
        }
        double tipAmt = (initialBill*percent) / 100;
        String tipAmt1 = formatter.format(tipAmt);
        double finalBill = initialBill + tipAmt;
        String finalBill1 = formatter.format(initialBill + tipAmt);
        String ibPerPerson = formatter.format(initialBill / people);
        String fbPerPerson = formatter.format(finalBill / people);
        String tipPerPerson = formatter.format(tipAmt / people);

        System.out.println("-------------------");
        System.out.println("Total bill before tip: " + initialBill);
        System.out.println("Tip percentage: " + percent);
        System.out.println("Total tip: " + tipAmt1);
        System.out.println("Total bill with tip: " + finalBill1);
        System.out.println("Per person cost before tip: " + ibPerPerson);
        System.out.println("Tip per person: " + tipPerPerson);
        System.out.println("Total cost per person: " + fbPerPerson);
        System.out.println("-------------------");
    }

}
