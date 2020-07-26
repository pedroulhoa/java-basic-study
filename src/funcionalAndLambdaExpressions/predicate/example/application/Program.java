package funcionalAndLambdaExpressions.predicate.example.application;

import funcionalAndLambdaExpressions.predicate.example.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Implementação interface funcional Predicate
        //list.removeIf(new ProductPredicate());

        // Implementação Reference method com método estático
        //list.removeIf(Product::staticProductPredicate);

        // Implementação Reference method com método não estático
        //list.removeIf(Product::nonStaticProductPredicate);

        // Implementação Expressão lambda declarada
        // Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        // list.removeIf(pred);

        // Implementação Expressão lambda inline
        list.removeIf(p -> p.getPrice() >= 100.0);

        for (Product p : list) System.out.println(p);

    }
}
