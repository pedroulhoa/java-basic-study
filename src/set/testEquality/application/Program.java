package set.testEquality.application;

import set.testEquality.entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

//        como set testa igualdade

//        Set<Product> set = new HashSet<>();
//
//        set.add(new Product("TV", 900.0));
//        set.add(new Product("Notebook", 1200.0));
//        set.add(new Product("Tablet", 400.0));
//
//        Product prod = new Product("Tablet", 400.0);
//
//        System.out.println(set.contains(prod));

//----------------------------------

//      como treeSet compara os elementos (Interface Comparable)

        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        for (Product p : set) {
            System.out.println(p);
        }

    }
}
