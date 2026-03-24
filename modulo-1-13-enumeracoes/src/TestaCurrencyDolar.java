import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

public class TestaCurrencyDolar {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(in);


        out.print("What is the dollar price? ");
        double dollarPrice = scan.nextDouble();
        out.print("How many dollars will be bought? ");
        double amount = scan.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f ", CurrencyConverter.converter(amount, dollarPrice));


    }
}
