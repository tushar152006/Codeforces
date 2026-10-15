import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            solve(a);
        }

        sc.close();
    }

    private static void solve(int[] a) {
        Arrays.sort(a);

        StringBuilder result = new StringBuilder();
        StringBuilder duplicates = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            if (i == 0 || a[i] != a[i - 1]) {
                result.append(a[i]).append(' ');
            } else {
                duplicates.append(a[i]).append(' ');
            }
        }

        result.append(duplicates);
        System.out.println(result.toString().trim());
    }
}
