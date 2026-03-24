import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {

    //Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
    //no 1.º e 2.º semestres. Cada uma dessas informações deve ser armazenada num vetor. Depois, imprimir
    //os nomes dos alunos aprovados, considerando aprovado aqueles cuja média das notas seja maior ou
    //igual a 6.0 (seis).


        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos alunos serao digitados? ");
        int n = scan.nextInt();
        scan.nextLine();

        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        double soma = 0;


        for(int i =0; i<n; i++){

            System.out.println("Digite nome, primeira e segunda nota do "+(i +1)+"o aluno: ");
            nome[i]= scan.nextLine();
            nota1[i] = scan.nextDouble();
            nota2[i] = scan.nextDouble();
            scan.nextLine();



        }
        System.out.println("Alunos aprovados: " );
        for(int i = 0;i<n;i++){
            soma = nota1[i] + nota2[i];
            if(soma/2>=6){
                System.out.println( nome[i]);

            }


        }







    }
}
