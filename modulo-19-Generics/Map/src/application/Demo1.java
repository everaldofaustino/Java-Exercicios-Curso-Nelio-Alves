package application;

import java.util.Map;
import java.util.TreeMap;

public class Demo1 {

    static void main(String[] args) {

        Map<String,String> cookies = new TreeMap<>();

        cookies.put("username","Maria");
        cookies.put("email","@gmail.com");
        cookies.put("phone","99787844");

        //cookies.remove("email");

        System.out.println(cookies.containsKey("phone"));

        System.out.println(cookies.get("phone"));;

        System.out.println("Email" + cookies.get("email"));

        System.out.println("ALL COOKIES:");
        for(String key : cookies.keySet()){
            System.out.println(key + ": "+cookies.get(key));
        }





    }
}
