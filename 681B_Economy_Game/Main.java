import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean found = false;

        for (int i = 0; i <= n / 1234567; i++) {
            for (int j = 0; j <= n / 123456; j++) {
                int rem = n - (i * 1234567) - (j * 123456);

                if (rem >= 0 && rem % 1234 == 0) {
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        System.out.println(found ? "YES" : "NO");

        sc.close();
    }
}
