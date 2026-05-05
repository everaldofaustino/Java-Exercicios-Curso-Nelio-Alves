package application;

import entities.Product;
import services.CalculationServices;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    static void main(String[] args)  {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\evera\\Documents\\Cursos\\Java\\Curso_Nélio_Alves\\exercicios\\modulo-19-Generics\\delimited-generics\\texto.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line !=null){
                String[] fields =line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationServices.max(list);
            System.out.println("Most expensive: ");
            System.out.println(x);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
