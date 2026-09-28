import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] level = new boolean[n + 1];

        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int a = sc.nextInt();
            level[a] = true;
        }

        int y = sc.nextInt();
        for (int i = 0; i < y; i++) {
            int b = sc.nextInt();
            level[b] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!level[i]) {
                System.out.println("Oh, my keyboard!");
                return;
            }
        }

        System.out.println("I become the guy.");
        sc.close();
    }
}