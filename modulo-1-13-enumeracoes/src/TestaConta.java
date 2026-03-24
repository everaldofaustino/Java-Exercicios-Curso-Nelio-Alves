import java.lang.invoke.StringConcatFactory;
import java.util.Locale;
import java.util.Scanner;

public class TestaConta {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o número da conta: ");
        int numero = scan.nextInt();
        scan.nextLine();

        System.out.print("Entre com o  titular da conta: ");
        String name = scan.nextLine();

        System.out.print("Existe um valor inicial de depósito (y/n)? ");
        char  permissao = Character.toUpperCase(scan.next().charAt(0));
        Conta conta1;
        if(permissao == 'Y'){
            System.out.print("Depósito inicial: " );
            double depositoInicial = scan.nextDouble();
            conta1 = new Conta( name, numero,  depositoInicial);

        }else{
            conta1 = new Conta(name,numero);
        }

        System.out.println("\nDados da conta: ");

        System.out.println(conta1);
        scan.nextLine();

        System.out.print("\nValor do depósito: ");
        double valor = scan.nextDouble();
        conta1.deposito(valor);
        System.out.println("Atualizando dados da conta: ");
        System.out.println(conta1);

        System.out.print("\nValor do saque: ");
        valor = scan.nextDouble();
        conta1.saque(valor);
        System.out.println("Atualizando dados da conta: ");
        System.out.println(conta1);





    }


}
