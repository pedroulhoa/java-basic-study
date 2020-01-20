package estrutura_condicional;

import java.util.Scanner;

public class EscopoEInicializacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Uma variável não pode ser usada se não for iniciada
        double price = sc.nextDouble();

        if (price > 100.0) {
            double discount = price * 0.1;
        }

        // Não é possível acessar discount aqui, pois a mesma está dentro do escopo do IF acima.
        //System.out.println(discount);
    }

}
