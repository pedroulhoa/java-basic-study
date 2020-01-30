package map.exemplo;

import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {

        java.util.Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@email.com");
        cookies.put("phone", "81887745");

        cookies.remove("email");

        // não aceita repetições. Como já existe uma chave phone, valor é substituido.
        cookies.put("phone", "6549879465");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }

}
