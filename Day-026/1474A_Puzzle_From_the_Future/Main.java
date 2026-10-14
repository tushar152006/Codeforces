import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String b = sc.next();
            StringBuilder a = new StringBuilder();

            int prev = -1;

            for (int i = 0; i < n; i++) {
                int bit = b.charAt(i) - '0';
                int chosen = -1;

                for (int x = 1; x >= 0; x--) {
                    int sum = bit + x;

                    if (sum != prev) {
                        chosen = x;
                        prev = sum;
                        break;
                    }
                }

                a.append(chosen);
            }

            System.out.println(a);
        }

        sc.close();
    }
}
