package funcional_lambda.comparator.exemplo.application;

import funcional_lambda.comparator.exemplo.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        /* Comparator objeto de classe separada */
        // list.sort(new MyComparator());

        /* Comparator objeto de classe anônima */
        // Comparator<Product> comp = new Comparator<Product>() {
        //    @Override
        //    public int compare(Product p1, Product p2) {
        //        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        //    }
        // };

        /* Comparator objeto de expressão lambda com chaves */
        // Comparator<Product> comp = (p1, p2) -> {
        //    return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        // };

        /* Comparator objeto de expressão lambda sem chaves */
        // Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        /* Comparator expressão lambda "direto no argumento" */
        // list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        /* Comparator expressão lambda "direto no argumento" com comparing */
        // list.sort(Comparator.comparing(p -> p.getName().toUpperCase()));

        /* Comparator expressão lambda "direto no argumento" com method reference */
        list.sort(comparing(Product::getName));


        for (Product p : list) {
            System.out.println(p);
        }
    }

}
