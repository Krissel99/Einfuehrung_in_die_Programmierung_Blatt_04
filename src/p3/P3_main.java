package p3;

public class P3_main {
    public static void main(String[] args) {
        boolean[] x = {true, true, false, false};
        boolean[] y = {true, false, true, false};

        boolean[][] A = new boolean[x.length][y.length];

        for (int j = 0; j < y.length; j++) {
            A[0][j] = !(x[j] != y[j] && x[j] == y[j]);
            A[1][j] = x[j] || true;
            A[2][j] = x[j] && false;
            A[3][j] = (x[j] && !y[j]) || (!x[j]);
        }
        
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}

