import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int suffZero = 0, suffOne = 0;

            for (char c : s.toCharArray()) {
                if (c == '0') {
                    suffZero++;
                } else {
                    suffOne++;
                }
            }

            int ans = Math.min(suffZero, suffOne);
            int prefZero = 0, prefOne = 0;

            for (char c : s.toCharArray()) {
                if (c == '0') {
                    prefZero++;
                    suffZero--;
                } else {
                    prefOne++;
                    suffOne--;
                }

                ans = Math.min(ans, prefZero + suffOne);
                ans = Math.min(ans, prefOne + suffZero);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
