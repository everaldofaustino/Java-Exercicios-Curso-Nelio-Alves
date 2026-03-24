import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class negativos {

    public static void main(String[] args) {

        //Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        //e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int n = scan.nextInt();
        int[] vect = new int[n];


        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scan.nextInt();


        }
        System.out.println("NÚMEROS NEGATIVOS: ");
        for(int num : vect){
            if (num<0){

                System.out.println(num);
            }

        }







    }
}
