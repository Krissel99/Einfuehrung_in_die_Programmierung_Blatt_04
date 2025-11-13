package p2;

public class P2_main {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 6;
        double x = 1.5, y = 2.3;
        int[] intResult = {c - a * 3, c / b, a + b / c};
        double[] doubleResult = {c / b, c + a / b, x + y * b};


        for (int i = 0; i < intResult.length; i++) {
            System.out.println(intResult[i]);
        }
        ;
        for (int i = 0; i < doubleResult.length; i++) {
            System.out.println(doubleResult[i]);
        }

    }
}
