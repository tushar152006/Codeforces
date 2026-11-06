import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long h = sc.nextLong();

            long[] x = new long[n];

            for (int i = 0; i < n; i++) {
                x[i] = sc.nextLong();
            }

            long left = 1;
            long right = h;
            long ans = h;

            while (left <= right) {
                long mid = left + (right - left) / 2;
                long damage = mid;

                for (int i = 0; i < n - 1; i++) {
                    damage += Math.min(mid, x[i + 1] - x[i]);
                }

                if (damage >= h) {
                    ans = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
