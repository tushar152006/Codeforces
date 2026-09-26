import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int time = 240 - k;
        int need = 0;
        int solved = 0;

        for (int problem = 1; problem <= n; problem++) {
            need += problem * 5;

            if (need > time) {
                break;
            }

            solved++;
        }

        System.out.println(solved);
        sc.close();
    }
}
