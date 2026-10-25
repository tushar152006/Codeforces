import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long res = 0;
            int cells = 8;
            int moves = 1;

            for (int i = 0; i < n / 2; i++) {
                res += (long) cells * moves;
                moves++;
                cells += 8;
            }

            System.out.println(res);
        }

        sc.close();
    }
}
