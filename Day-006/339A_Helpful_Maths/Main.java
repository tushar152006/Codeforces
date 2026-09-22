import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();

        int n = (x.length() / 2) + 1;
        int[] a = new int[n];

        for (int i = 0, j = 0; i < x.length(); i += 2, j++) {
            a[j] = x.charAt(i) - '0';
        }

        Arrays.sort(a);

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                ans.append("+");

            }
            ans.append(a[i]);

        }
        System.out.println(ans);
    }
}
