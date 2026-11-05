import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (i == 0) {
                if (ch >= '5' && ch <= '8') {
                    ch = (char) ('9' - ch + '0');
                }
            } else {
                if (ch >= '5' && ch <= '9') {
                    ch = (char) ('9' - ch + '0');
                }
            }

            ans += ch;
        }

        System.out.println(ans);
    }
}
