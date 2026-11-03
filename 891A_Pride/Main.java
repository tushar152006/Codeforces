import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int ones = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 1) {
                ones++;
            }
        }

        if (ones > 0) {
            System.out.println(n - ones);
            return;
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int g = a[i];

            for (int j = i + 1; j < n; j++) {
                g = gcd(g, a[j]);

                if (g == 1) {
                    ans = Math.min(ans, j - i);
                    break;
                }
            }
        }

        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans + n - 1);
        sc.close();
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
