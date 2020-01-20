package estrutura_sequencial;

import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args) {

        char gender = 'F';
        int age = 23;
        double balance = 10.23987;
        String name = "Maria";

        System.out.println("alo doido");
        System.out.println("alo doido");

        System.out.println("good night parcero");

        System.out.println("------------------");

        System.out.printf("%.2f%n", balance);
        System.out.printf("%.4f%n", balance);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", balance);

        System.out.println("------------------");

        System.out.printf("%s is %d years old, gender %c, and got balance = %.2f bitcons%n", name, age, gender, balance);

    }

}
