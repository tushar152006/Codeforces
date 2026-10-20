import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long r = sc.nextLong();

            long k = Math.min(n - 1, r);
            long ans = k * (k + 1) / 2;

            if (r >= n) {
                ans++;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
