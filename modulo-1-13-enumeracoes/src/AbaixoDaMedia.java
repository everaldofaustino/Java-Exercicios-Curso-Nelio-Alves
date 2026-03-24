import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

    public static void main(String[] args) {

    //Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        //mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        //os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
        Locale.setDefault(Locale.US);
        Scanner scan =  new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scan.nextInt();
        double[] vetor = new double[n];
        Double soma = 0.0;
        for (int i = 0;i<n;i++){

            System.out.print("Digite um numero: ");
            vetor[i]= scan.nextDouble();
            soma += vetor[i];


        }
        double media = soma/n;
        System.out.printf("\nMEDIA DO VETOR = %.3f", media);

        System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");
        for(double numero:vetor){
            if(numero<media){
                System.out.println(numero);
            }

        }

    }
}
