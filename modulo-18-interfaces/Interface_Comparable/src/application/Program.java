package application;

import entities.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
    static void main(String[] args)  {


        List<Employee> list = new ArrayList<>();
        String path ="C:\\Users\\evera\\Documents\\Cursos\\Java\\Curso_Nélio_Alves\\exercicios\\modulo-18-interfaces\\Interface_Comparable\\texto.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String employeeCsv = br.readLine();
            while(employeeCsv != null){
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();

            }

            Collections.sort(list);

            for (Employee emp : list ){

                System.out.println(emp.getName() +", "+ emp.getSalary());
            }





        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;


    }

}
