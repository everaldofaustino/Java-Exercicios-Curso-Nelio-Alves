package application;

import com.sun.jdi.connect.Connector;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer>  b = new HashSet<>();
        Set<Integer> c = new HashSet<>();


        System.out.print("How many students for course A? ");
        int courseA = sc.nextInt();
        for(int i =0;i<courseA;i++){
            int studentCode = sc.nextInt();
            a.add(studentCode);

        }

        System.out.print("How many students for course B? ");
        int courseB = sc.nextInt();
        for(int i =0;i<courseB;i++){
            int studentCode = sc.nextInt();
            b.add(studentCode);

        }

        System.out.print("How many students for course C? ");
        int courseC = sc.nextInt();
        for(int i =0;i<courseC;i++){
            int studentCode = sc.nextInt();
            c.add(studentCode);

        }

        //Union
        Set<Integer> total = new HashSet<>();
        total.addAll(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " +total.size());







    }
}
