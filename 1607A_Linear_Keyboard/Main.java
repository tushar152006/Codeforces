import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String keyboard = sc.next();
            String s = sc.next();

            int[] idx = new int[26];

            for (int i = 0; i < 26; i++) {
                idx[keyboard.charAt(i) - 'a'] = i;
            }

            int ans = 0;

            for (int i = 1; i < s.length(); i++) {
                ans += Math.abs(
                        idx[s.charAt(i) - 'a'] -
                        idx[s.charAt(i - 1) - 'a']
                );
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
