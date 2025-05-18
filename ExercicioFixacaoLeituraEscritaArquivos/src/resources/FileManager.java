package resources;

import entities.Product;

import java.io.*;
import java.util.ArrayList;

public class FileManager {

    private static final File path = new File("archives/summary.csv");

    public static void write(Product p) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(p.getName() + "," + p.getPrice() + "," + p.getQuantityInStock());
            bw.newLine();

        } catch (IOException e) {
            System.out.println("ERROR" + e.getMessage());
        }
    }

    public static ArrayList<Product> read() {

        ArrayList<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] productAttributes = line.split(",");
                Product product = new Product(productAttributes[0], Double.parseDouble(productAttributes[1]), Integer.parseInt(productAttributes[2]));
                products.add(product);
            }

        } catch (IOException e) {
            System.out.println("ERROR:" + e.getMessage());
        }

        return products;
    }

}
