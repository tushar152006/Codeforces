import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int div;

            if (r >= 1900) {
                div = 1;
            } else if (r >= 1600) {
                div = 2;
            } else if (r >= 1400) {
                div = 3;
            } else {
                div = 4;
            }

            System.out.println("Division " + div);
        }

        sc.close();
    }
}
