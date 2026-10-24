import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();
            int i = 0;
            int count = 0;

            while (count < k) {
                i++;

                if (i % 3 != 0 && i % 10 != 3) {
                    count++;
                }
            }

            System.out.println(i);
        }

        sc.close();
    }
}
