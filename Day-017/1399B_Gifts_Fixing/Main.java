import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];

            long minA = Long.MAX_VALUE;
            long minB = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                minA = Math.min(minA, a[i]);
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
                minB = Math.min(minB, b[i]);
            }

            long operations = 0;
            for (int i = 0; i < n; i++) {
                operations += Math.max(a[i] - minA, b[i] - minB);
            }

            System.out.println(operations);
        }

        sc.close();
    }
}
