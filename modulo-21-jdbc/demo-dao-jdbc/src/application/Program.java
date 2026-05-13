package application;

import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Program {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt= DateTimeFormatter.ofPattern("dd/MM/yyyy");


        Department obj = new Department(1,"Books");
        Seller seller = new Seller(21,"Bob","bob@gmail.com", LocalDate.parse("11/02/1990", fmt), 3000.0, obj );

        System.out.println(seller);

    }
}
