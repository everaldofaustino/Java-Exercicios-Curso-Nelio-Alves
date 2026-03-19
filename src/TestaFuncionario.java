import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TestaFuncionario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);


        List<Funcionario> listaFuncionario = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0;i<n; i++){
            System.out.println("Emplyoee#"+(i+1)+":");
            System.out.print("Id: ");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.print("Name: ");
            String nome = scan.nextLine();

            System.out.print("Salary: ");
            double salario = scan.nextDouble();
            scan.nextLine();

            Funcionario f = new Funcionario(id,nome,salario);
            listaFuncionario.add(f);


        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idChoice = scan.nextInt();
        Funcionario fun = listaFuncionario.stream().filter(x -> x.getId() == idChoice).findFirst().orElse(null);

        if (fun == null){
            System.out.println("This id does not exist.");

        }

        else{

            System.out.print("Enter the percentage: ");
            double percentage = scan.nextDouble();
            fun.setSalario(fun.getId(),fun.getSalario() + (percentage* fun.getSalario())/100.0);

        }




        System.out.println("List of employees: ");

        for(Funcionario f : listaFuncionario){

            System.out.println(f);
        }



    }
}
