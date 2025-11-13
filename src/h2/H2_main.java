package h2;

public class H2_main {
    public static void main(String[] args) {
        boolean x = true, y = false, a = true, b = true, c = true;
        int input = 10;

        if (input == 10 || input == 11) {
            x = true;
        } else x = false;
        if (input == 11 || input == 1) {
            y = true;
        } else y = false;
        
        boolean E1 = (x == true), E2 = (y == true), E3 = (x != y);

        a = (E1 == true && E2 == true);
        b = (E1 == true || E3 == true);
        c = (x == true && y == false) || (x == false && y == false);

        System.out.println("x ist " + x);
        System.out.println("y ist " + y);
        System.out.println("a ist " + a);
        System.out.println("b ist " + b);
        System.out.println("c ist " + c);
    }
}
