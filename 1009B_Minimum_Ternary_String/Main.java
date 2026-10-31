import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int cnt = 0;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            } else {
                ans.append(s.charAt(i));
            }
        }

        int pos = ans.indexOf("2");

        if (pos == -1) {
            System.out.println(ans.toString() + "1".repeat(cnt));
        } else {
            ans.insert(pos, "1".repeat(cnt));
            System.out.println(ans);
        }

        sc.close();
    }
}
