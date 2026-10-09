import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            int zeroCount = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 0) {
                    zeroCount++;
                }
                sum += x;
            }

            sum += zeroCount;
            System.out.println(sum == 0 ? zeroCount + 1 : zeroCount);
        }

        sc.close();
    }
}
