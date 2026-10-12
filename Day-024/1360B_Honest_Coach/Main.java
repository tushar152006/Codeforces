import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int minDiff = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                minDiff = Math.min(minDiff, a[i] - a[i - 1]);
            }

            System.out.println(minDiff);
        }

        sc.close();
    }
}
