import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            Set<Character> set = new HashSet<>();
            boolean ok = true;

            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);

                if (i > 0 && ch != s.charAt(i - 1) && set.contains(ch)) {
                    ok = false;
                    break;
                }

                set.add(ch);
            }

            System.out.println(ok ? "YES" : "NO");
        }

        sc.close();
    }
}
