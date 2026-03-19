import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {

        //Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        //tela todos os números pares, e também a quantidade de números pares.

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int n = scan.nextInt();
        int[] numeros = new int[n];

        int qtd = 0;
        for(int i = 0;i<n; i++){
            System.out.print("Digite um numero: ");
           numeros[i] = scan.nextInt();

            if(numeros[i]%2==0){
                qtd++;

            }

        }
        System.out.println("\nNUMEROS PARES: ");
        for(int num:numeros){
            if(num%2==0){

                System.out.print(num + " ");
            }

        }


        System.out.print("\n\nQUANTIDADE DE PARES = " + qtd);



    }
}
