import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long x = sc.nextLong();

            long zeroIndexedX = x - 1;
            long row = zeroIndexedX % n;
            long col = zeroIndexedX / n;
            long result = (row * m) + col + 1;

            System.out.println(result);
        }

        sc.close();
    }
}
