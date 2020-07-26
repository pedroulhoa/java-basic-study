package funcionalAndLambdaExpressions.consumer.example.application;

import funcionalAndLambdaExpressions.consumer.example.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Implementação da interface Consumer
        // list.forEach(new PriceUpdate());
        // list.forEach(System.out::println);

        // Implementação Reference method com método estático
        // list.forEach(Product::staticPriceUpdate);
        // list.forEach(System.out::println);

        // Implementação Reference method com método não estático
        // list.forEach(Product::nonStaticPriceUpdate);
        // list.forEach(System.out::println);

        // Implementação expressão lambda declarada
        // Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
        // list.forEach(cons);
        // list.forEach(System.out::println);

        // Implementação expressão lambda inline
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
        list.forEach(System.out::println);

    }
}
