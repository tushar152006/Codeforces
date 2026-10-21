import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < 2 * n; i += 2) {
                ans.append(s.charAt(i));
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
