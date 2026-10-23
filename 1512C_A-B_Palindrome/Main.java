import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            char[] s = sc.next().toCharArray();
            int n = s.length;
            boolean valid = true;

            for (int i = 0; i < n / 2; i++) {
                int j = n - 1 - i;

                if (s[i] == '?' && s[j] != '?') {
                    s[i] = s[j];
                } else if (s[j] == '?' && s[i] != '?') {
                    s[j] = s[i];
                } else if (s[i] != '?' && s[j] != '?' && s[i] != s[j]) {
                    valid = false;
                    break;
                }
            }

            if (!valid) {
                System.out.println(-1);
                continue;
            }

            for (char c : s) {
                if (c == '0') {
                    a--;
                } else if (c == '1') {
                    b--;
                }
            }

            if (a < 0 || b < 0) {
                System.out.println(-1);
                continue;
            }

            if (n % 2 == 1 && s[n / 2] == '?') {
                if (a % 2 == 1) {
                    s[n / 2] = '0';
                    a--;
                } else if (b % 2 == 1) {
                    s[n / 2] = '1';
                    b--;
                } else {
                    valid = false;
                }
            }

            for (int i = 0; i < n / 2 && valid; i++) {
                int j = n - 1 - i;

                if (s[i] == '?' && s[j] == '?') {
                    if (a >= 2) {
                        s[i] = s[j] = '0';
                        a -= 2;
                    } else if (b >= 2) {
                        s[i] = s[j] = '1';
                        b -= 2;
                    } else {
                        valid = false;
                    }
                }
            }

            if (valid && a == 0 && b == 0) {
                System.out.println(new String(s));
            } else {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}
