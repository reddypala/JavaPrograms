package streams;

import java.util.ArrayList;
import java.util.List;

/** collection with objects */

public class filterdemo4 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product(101, "Hp Laptop", 25000));
        productsList.add(new Product(102, "Dell Laptop", 27000));
        productsList.add(new Product(103, "Lenovo Laptop", 35000));
        productsList.add(new Product(104, "Sony Laptop", 23200));
        productsList.add(new Product(105, "AppleLaptop", 99000));

        productsList.stream().filter(p -> p.price > 25000).forEach(pr -> System.out.println(pr.price));
    }
}

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
