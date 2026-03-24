import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

    public static void main(String[] args) {
        //Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        //o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        //considerando a primeira posição como 0 (zero).
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int n = scan.nextInt();
        int[] vetor = new int[n];
        double max = vetor[0];
        int posicaoMaior = 0;
        for(int i = 0; i<n;i++){
            System.out.print("Digite um numero: ");
            vetor[i]= scan.nextInt();

            if(vetor[i]>max){
                max = vetor[i];
                posicaoMaior = i;

            }

        }
        System.out.printf("\nMAIOR VALOR = %.1f",max);
        System.out.print("\nPOSICAO DO MAIOR VALOR = " + posicaoMaior );

    }
}
