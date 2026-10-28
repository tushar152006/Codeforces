import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        long ans = (long) (a[n - 1] - a[0])
                * (a[2 * n - 1] - a[n]);

        for (int i = 1; i < n; i++) {
            long area = (long) (a[i + n - 1] - a[i])
                    * (a[2 * n - 1] - a[0]);

            ans = Math.min(ans, area);
        }

        System.out.println(ans);
        sc.close();
    }
}
