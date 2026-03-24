import java.util.Locale;
import java.util.Scanner;

public class TestaStudent {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Student estudante = new Student();

        estudante.name = scan.nextLine();

       estudante.nota1 = scan.nextDouble();
       estudante.nota2 = scan.nextDouble();
       estudante.nota3 = scan.nextDouble();


       System.out.printf("FINAL GRADE = %.2f%n", estudante.finalGrade());
        if(estudante.finalGrade()<60){
            System.out.println("FAILED");
            System.out.printf( "MISSING %.2f POINTS" , estudante.missingPoints());

        }else{
            System.out.println("PASS");
        }

    }
}
