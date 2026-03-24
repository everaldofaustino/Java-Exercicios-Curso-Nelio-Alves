import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    public static void main(String[] args) {

        //Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        //tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        //bem como os nomes dessas pessoas caso houver.
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scan.nextInt();
        scan.nextLine();
        Pessoas[] vetor = new Pessoas[n];




        double sum = 0.0;
        for(int i = 0; i<vetor.length; i++){
            System.out.println("Dados da " + (i + 1) +"a pessoa: ");
            System.out.print("Nome: ");
            String name = scan.nextLine();
            System.out.print("Idade: ");
            int idade = scan.nextInt();
            System.out.print("Altura: ");
            double altura = scan.nextDouble();
            vetor[i] = new Pessoas(name,idade,altura);
            scan.nextLine();
            sum += altura;

        }

        System.out.printf("\nAltura média: %.2f ", sum/n);
        double total = 0;
        for(int i = 0; i<n; i++){
            if(vetor[i].getIdade()<16){


                total++;

            }


        }

        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%\n",  total/n * 100 );



        for(int i = 0; i<n; i++){
            if(vetor[i].getIdade()<16){

                System.out.println(vetor[i].getName());


            }


        }


    }
}
