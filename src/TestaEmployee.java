import java.util.Scanner;


public class TestaEmployee {

    public static void main(String[] args) {

        Employee employee1 = new Employee("João Silva",6000,1000);
        System.out.println("Employee: " + employee1.getName() + ", $ " +employee1.netSalary());
        double percentage = 10.0;
        System.out.println("Which percentage to increase salary? " + percentage);
        employee1.increaseSalary(10);

        System.out.print("Update data: " + employee1.toString());

    }
}
