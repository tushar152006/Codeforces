import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= c; i++) {
            total += i * a;
        }

        int borrowed = total - b;

        if (borrowed < 0) {
            borrowed = 0;

        }
        System.out.println(borrowed);
    }
}