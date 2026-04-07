package application;

import entities.Product;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> listaProduto = new ArrayList<>();

        System.out.println("Enter a folder path: ");
        String source = sc.nextLine();
        File path = new File(source);

        // Criar diretório
        boolean success = new File(path.getParent() + "\\pasta").mkdir();
        System.out.println("Directory created successfully: " + success);

        String newFile = path.getParent() + "\\pasta\\summary.csv";

        // Bloco try-catch para leitura e escrita
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] partes = line.split(",");
                String name = partes[0];
                double valor = Double.parseDouble(partes[1]);
                int quantidade = Integer.parseInt(partes[2]);

                Product p = new Product(name, valor, quantidade);
                listaProduto.add(p);
                System.out.println(p);
                line = br.readLine();
            }

            // Escrita em OUTRO arquivo (não no mesmo que está lendo)
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
                for (Product item : listaProduto) {
                    bw.write(item.getName() + ", " + item.total());
                    bw.newLine();
                }
                System.out.println("File written successfully: " + newFile);
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}