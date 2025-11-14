package h2;

public class H2_main {
    public static void main(String[] args) {
        boolean x = false, y = true, a = false, b = false, c = false;
        int input = 0;

        x = input == 10 || input == 11;
        y = input == 11 || input == 1;

        boolean E1 = (x == true), E2 = (y == true), E3 = (x != y);

        a = E1 == true && E2 == true;
        b = E1 == true || E3 == true;
        c = (x == true && y == false) || (x == false && y == false);

        System.out.println("x ist " + x);
        System.out.println("y ist " + y);
        System.out.println("E1 ist " + E1);
        System.out.println("E2 ist " + E2);
        System.out.println("E3 ist " + E3);
        System.out.println("a ist " + a);
        System.out.println("b ist " + b);
        System.out.println("c ist " + c);
    }
}
