import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] freq = new int[n + 1];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq[x]++;
            }

            int score = 0;

            for (int i = 1; i <= n; i++) {
                int j = k - i;

                if (j < 1 || j > n) {
                    continue;
                }

                if (i < j) {
                    score += Math.min(freq[i], freq[j]);
                } else if (i == j) {
                    score += freq[i] / 2;
                }
            }

            System.out.println(score);
        }

        sc.close();
    }
}
