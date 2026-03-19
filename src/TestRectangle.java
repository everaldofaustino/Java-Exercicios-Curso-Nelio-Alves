import java.util.Locale;
import java.util.Scanner;

public class TestRectangle  {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);
        Rectangle reta = new Rectangle();

        System.out.print("Digite a Largura: ");
        reta.width= scan.nextDouble();
        System.out.print("Digite a altura: ");
        reta.height = scan.nextDouble();

        System.out.printf("AREA = %.2f\n" ,reta.area());
        System.out.printf("PERIMETER = %.2f\n", reta.perimeter());
        System.out.printf("DIAGONAL = %.2f",reta.diagonal());


    }
}
