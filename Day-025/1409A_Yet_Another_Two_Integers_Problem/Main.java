import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (b < a) {
                long temp = a;
                a = b;
                b = temp;
            }

            long difference = b - a;
            long operations = difference / 10;
            if (difference % 10 > 0) {
                operations++;
            }

            System.out.println(operations);
        }

        sc.close();
    }
}
