import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            long[] prefixSum = new long[n];
            int[] prefixMax = new int[n];

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();

                prefixSum[i] = a + (i > 0 ? prefixSum[i - 1] : 0);
                prefixMax[i] = Math.max(a, i > 0 ? prefixMax[i - 1] : 0);
            }

            while (q-- > 0) {
                int k = sc.nextInt();

                int low = 0, high = n - 1, ans = -1;

                while (low <= high) {
                    int mid = low + (high - low) / 2;

                    if (prefixMax[mid] <= k) {
                        ans = mid;
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }

                System.out.print((ans == -1 ? 0 : prefixSum[ans]) + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
