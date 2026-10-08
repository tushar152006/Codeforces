import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int odd = 0;
            int even = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x % 2 != 0) {
                    odd++;
                } else {
                    even++;
                }
            }

            if (even == n || (odd == n && n % 2 == 0)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}
