package application;

import model.BrazilInterestService;
import model.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantia: ");
        double amount = sc.nextDouble();

        System.out.print("Meses: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount,months);
        System.out.println("Pagamento após" + months + "meses:");
        System.out.println(String.format("%.2f",payment));






    }


}
