import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int even = 0;
            int odd = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            boolean possible = even % 2 == 0 && odd % 2 == 0;
            if (!possible) {
                Arrays.sort(a);
                for (int i = 1; i < n; i++) {
                    if (a[i] - a[i - 1] == 1) {
                        possible = true;
                        break;
                    }
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
