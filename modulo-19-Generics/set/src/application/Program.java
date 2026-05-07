package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    static void main(String[] args) {

        // Set<String> set = new HashSet<>(); // Sem ordenação

        //Set<String> set = new TreeSet<>(); //Ordenação
        Set<String> set = new LinkedHashSet<>();


        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        //set.removeIf(x -> x.length() >= 3);
        set.removeIf(x -> x.charAt(0) == 'T');
        //System.out.println(set.contains("Notebook"));

        for (String p : set){
            System.out.println(p);
        }




    }
}
