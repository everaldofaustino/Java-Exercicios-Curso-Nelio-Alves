import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

    public static void main(String[] args) {

        //Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
        //que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
        //de homens.

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scan.nextInt();
        double[] altura = new double[n];
        char[] genero = new char[n];

        int maior = 0;
        int menor = 0;

        for(int i = 0;i<n;i++){

            System.out.print("Altura da " + (i+1)+"a pessoa: ");
            altura[i] = scan.nextDouble();
            System.out.print("Genero da "+ (i+1)+ "a pessoa: ");
            genero[i] = scan.next().charAt(0);





        }

        double min = altura[0];
        double max = altura[0];

        for(int i =0 ;i<n;i++){

            if(altura[i]>max){
                max = altura[i];
                maior = i;
            }
            if(altura[i]<min){
                min = altura[i];
                menor = i;
            }


        }
        double soma = 0;
        int p =0;
        int qtdHomens =0;
        for(int i = 0;i<n;i++){
            if(genero[i]=='F'){
                soma = soma + altura[i];
                p++;

            }
            else{
                qtdHomens++;

            }

        }
        double media = soma/p;

        System.out.printf("Menor altura = %.2f" , altura[menor]);
        System.out.printf("\nMaior altura = %.2f" ,altura[maior]);

        System.out.printf("\nMédia das alturas das mulheres = %.2f", media);
        System.out.print("\nNùmero de homens = " + qtdHomens);





    }
}
