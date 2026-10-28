import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            int mn = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                mn = Math.min(mn, a[i]);
            }

            int ans = 0;

            for (int i = 0; i < n; i++) {
                ans += a[i] - mn;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
