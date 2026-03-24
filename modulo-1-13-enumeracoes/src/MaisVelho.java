import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

    public static void main(String[] args) {
         //Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        //devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
        //da pessoa mais velha.
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = scan.nextInt();
        scan.nextLine();
        String[] nome = new String[n];
        int[] idade = new int[n];
        int max = idade[0];
        int maisVelho = 0;
        for(int i = 0; i<n; i++){
            System.out.println("Dados da "+ (i +1) + "a pessoa: ");
            System.out.print("Nome: ");
            nome[i] = scan.nextLine();
            System.out.print("Idade: ");
            idade[i] =scan.nextInt();
            scan.nextLine();

            if(idade[i]>max){

                max = idade[i];
                maisVelho = i;

            }

        }

        System.out.println("PESSOA MAIS VELHA: " + nome[maisVelho]);











    }
}
