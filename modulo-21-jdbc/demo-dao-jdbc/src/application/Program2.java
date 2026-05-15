package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt= DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: Department findById ===");

        Department department = departmentDao.findById(3);

        System.out.println(department);



        System.out.println("\n=== TEST 2: seller findAll =====");


        List<Department> list  = departmentDao.findAll();


        for (Department obj : list){
            System.out.println(obj);
        }


        System.out.println("\n=== TEST 3: department insert =====");

        Department newDepartment = new Department(null,"Almoxarifado");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== TEST 5: seller update =====");

        department = departmentDao.findById(1);

        department.setName("TI");
        departmentDao.update(department);
        System.out.println("Update completed");


        System.out.println("\n=== TEST 6: department delete =====");

        System.out.println("Enter id for delete test: ");

        int id = sc.nextInt();
       departmentDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();

    }
}
