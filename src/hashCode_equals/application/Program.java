package hashCode_equals.application;

import hashCode_equals.entities.Client;

public class Program {

    public static void main(String[] args) {

        String a =  "Maria";
        String b = "Bob";

        System.out.println(a.equals(b));

        String ab = "Maria";
        String bc = "Alex";
        System.out.println(ab.hashCode());
        System.out.println(bc.hashCode());

        // TESTANDO COM OBJETO PERSONALIZADO

        Client c1 = new Client("Maria", "maria@mail.com");
        Client c2 = new Client("Maria", "maria@mail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

    }

}
