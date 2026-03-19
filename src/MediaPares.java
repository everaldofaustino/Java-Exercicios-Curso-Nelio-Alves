import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

    public static void main(String[] args) {

        //Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        //aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        //digitado, mostrar a mensagem "NENHUM NUMERO PAR"
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scan.nextInt();
        int[] vetor = new int[n];
        int soma = 0;
        int par = 0;
        for(int i = 0;i<n;i++){
            System.out.print("Digite um numero: ");
            vetor[i] = scan.nextInt();
            if(vetor[i]%2==0){
                soma += vetor[i];
                par++;

            }



        }
         if(soma != 0){

        double media = soma/par;
        System.out.print("MEDIA DOS PARES = "  + media);}
         else{
             System.out.println("NENHUM NÚMERO PAR.");

         }



    }
}
