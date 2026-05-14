package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class Program {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt= DateTimeFormatter.ofPattern("dd/MM/yyyy");

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);


        System.out.println("\n=== TEST 2: seller findByDepartment =====");

        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list){
            System.out.println(obj);
        }

    }
}
