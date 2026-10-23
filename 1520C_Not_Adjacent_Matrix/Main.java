import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n == 2) {
                output.append("-1\n");
                continue;
            }

            int[][] matrix = new int[n][n];
            int value = 1;

            for (int i = 0; i < n * n; i++) {
                if (value <= n * n) {
                    matrix[i / n][i % n] = value;
                    value += 2;
                }
            }

            value = 2;
            for (int i = 0; i < n * n; i++) {
                if (matrix[i / n][i % n] == 0) {
                    matrix[i / n][i % n] = value;
                    value += 2;
                }
            }

            for (int[] row : matrix) {
                for (int number : row) {
                    output.append(number).append(' ');
                }
                output.append('\n');
            }
        }

        System.out.print(output);
        sc.close();
    }
}
