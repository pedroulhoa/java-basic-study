package boxing_unboxing_wrapperClasses;

public class ExemploBoxingUnboxing {

    public static void main(String[] args) {

        // Boxing
        int x = 20;
        Object obj = x;
        System.out.println(obj);

        // Unboxing
        int y = (int) obj;
        System.out.println(y);

    }

}
