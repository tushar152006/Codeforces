import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int c1 = n / 3;
            int c2 = n / 3;

            if (n % 3 == 1) {
                c1++;
            } else if (n % 3 == 2) {
                c2++;
            }

            System.out.println(c1 + " " + c2);
        }

        sc.close();
    }
}
