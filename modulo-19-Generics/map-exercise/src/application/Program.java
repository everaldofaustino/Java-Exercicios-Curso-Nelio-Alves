package application;

import com.sun.jdi.VoidType;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.Native;
import java.util.*;

public class Program {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();
        Map<String,Integer> votes = new LinkedHashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){



            String line = br.readLine();
            while (line !=null){
                String[] fields = line.split(",");
                String name = fields[0];

                int vote = Integer.valueOf(fields[1]);

                if(votes.containsKey(name)){
                    int valor = votes.get(name);
                    votes.put(name,vote +valor );

                }

                else{

                    votes.put(name,vote);
                }

                line = br.readLine();


            }
            for(String key : votes.keySet()){
                System.out.println(key +": "+ votes.get(key) );
            }


        }

        catch (IOException e){
            System.out.println("Erro: " +e.getMessage());
        }


    }
}
