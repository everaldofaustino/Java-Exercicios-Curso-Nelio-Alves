public class Employee {

    private String name;
    private double grossSalary;
    private double tax;

    Employee(String name,double grossSalary,double tax){
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;

    }
    public double netSalary(){
       return grossSalary - tax;
    }

    public String getName(){
        return name;
    }

    public double getGrossSalary(){
        return grossSalary;
    }
    public void increaseSalary(double percentage){
        grossSalary += grossSalary * percentage / 100.0;

    }

    public String toString(){
        return name + ", $ " + String.format("%.2f" , netSalary());
    }

}
