package application;

import entities.Product;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

    static void main(String[] args) {

        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));


        Product prod = new Product("Notebook", 1200.0);
        System.out.println(set.contains(prod)); //Se hashCode e equals NÃO estiverem implementados: //Compara as referências (ponteiros) dos objetos


    }
}
