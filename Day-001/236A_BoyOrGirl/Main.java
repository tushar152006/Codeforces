import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        boolean[] seen = new boolean[26];
        int distinct = 0;

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if (!seen[index]) {
                seen[index] = true;
                distinct++;
            }
        }

        if (distinct % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}
