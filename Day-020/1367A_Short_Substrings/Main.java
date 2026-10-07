import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            sb.append(s.charAt(0));
            for (int i = 1; i < s.length(); i += 2) {
                sb.append(s.charAt(i));
            }

            sb.append('\n');
        }

        System.out.print(sb);
        sc.close();
    }
}
