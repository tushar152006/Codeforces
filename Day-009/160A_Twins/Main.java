import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] coins = new Integer[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
            total += coins[i];
        }

        Arrays.sort(coins, Collections.reverseOrder());

        int sum = 0;
        int count = 0;

        for (int coin : coins) {
            sum += coin;
            count++;

            if (sum > total / 2) {
                break;
            }
        }

        System.out.println(count);
    }
}
