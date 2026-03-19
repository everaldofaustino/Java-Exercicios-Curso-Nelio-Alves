import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {

        //Faça um programa que leia N números reais e armazene-os em um vetor.
        // Em seguida: - Imprimir todos os elementos do vetor -
        // Mostrar na tela a soma e a média dos elementos do vetor

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");

        int n = scan.nextInt();
       double[] vect = new double[n];
        double sum  = 0;
        for(int i = 0; i<n;i++){
            System.out.print("Digite um numero: ");
            vect[i] = scan.nextDouble();
            sum = sum + vect[i];
        }
        System.out.print("VALORES = ");
        for(double num:vect){

            System.out.print( num + " ");

        }





        System.out.printf("\nSOMA = %.2f ", sum);
        //double media = sum/vect.length;
        System.out.printf("\nMEDIA = %.2f  " , sum/vect.length);

    }
}
