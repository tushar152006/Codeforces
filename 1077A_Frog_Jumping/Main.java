import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long k = sc.nextLong();

            long ans = a * ((k + 1) / 2) - b * (k / 2);

            System.out.println(ans);
        }

        sc.close();
    }
}
