import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int place = 1;
            ArrayList<Integer> ans = new ArrayList<>();

            while (n > 0) {
                int digit = n % 10;

                if (digit != 0) {
                    ans.add(digit * place);
                }

                n /= 10;
                place *= 10;
            }

            System.out.println(ans.size());
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
