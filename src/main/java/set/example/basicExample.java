package set.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class basicExample {

    public static void main(String[] args) {

    // HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
    // TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
    // compareTo do objeto (ou Comparator)
    // LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados

        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("MR");
        set.add("Tablet");
        set.add("Notebook");

        set.remove("TV");

        set.removeIf(x -> x.length() >= 3);

        for (String p : set) {
            System.out.println(p);
        }
    }

}
