import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            String x = sc.next();
            int len = x.length();

            int result = (x.charAt(0) - '0' - 1) * 10;
            if (len == 1) {
                result += 1;
            } else if (len == 2) {
                result += 3;
            } else if (len == 3) {
                result += 6;
            } else {
                result += 10;
            }

            System.out.println(result);
        }

        sc.close();
    }
}
