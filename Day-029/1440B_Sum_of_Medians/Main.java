import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int range = n * k;
            long[] a = new long[range];

            for (int i = 0; i < range; i++) {
                a[i] = sc.nextLong();
            }

            int div = n / 2;
            int index = range - 1 - div;
            long sum = 0;

            for (int i = 0; i < k; i++) {
                sum += a[index];
                index -= div + 1;
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
