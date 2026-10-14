import java.util.Scanner;

public class Main {
    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int x = sc.nextInt();

        if (n <= 2) {
            System.out.println(1);
            return;
        }

        int ans = (n - 3) / x + 2;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }

        sc.close();
    }
}
