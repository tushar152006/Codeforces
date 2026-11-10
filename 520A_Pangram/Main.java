import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String input = sc.next().toLowerCase();
        sc.close();

        if (input.length() < 26) {
            System.out.println("NO");
            return;
        }

        boolean[] seen = new boolean[26];

        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                seen[ch - 'a'] = true;
            }
        }

        for (boolean letterSeen : seen) {
            if (!letterSeen) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
