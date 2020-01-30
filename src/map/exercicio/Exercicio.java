package map.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<String, Integer> candidates =  new LinkedHashMap<>();

            String line = br.readLine();

            while(line != null) {
                String[] values = line.split(",");
                String name = values[0];

                if (candidates.containsKey(name)) {
                    Integer increment = candidates.get(name) + Integer.valueOf(values[1]);
                    candidates.put(name, increment);
                } else {
                    candidates.put(name, Integer.valueOf(values[1]));
                }

                line = br.readLine();
            }

            for (String key : candidates.keySet()) {
                System.out.println(key + ": " + candidates.get(key));
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }

}
