import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 2) {
            System.out.println("Yes");

            System.out.print(n / 2 + " ");
            for (int i = 2; i <= n; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();

            System.out.print((n + 1) / 2 + " ");
            for (int i = 1; i <= n; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
