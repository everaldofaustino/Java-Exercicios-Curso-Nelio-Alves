package application;

import entities.LogEntry;

import javax.xml.transform.Source;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.time.Instant;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();

            while (line != null){
                String[] partes = line.split(" ");
                String username = partes[0];
                Instant moment = Instant.parse(partes[1]);

                set.add(new LogEntry(username,moment));

                line = br.readLine();

            }
            System.out.println("Total users: " +set.size());

        }
        catch (IOException e){
            System.out.println("Error: " +e.getMessage());
        }
        sc.close();


    }

}
