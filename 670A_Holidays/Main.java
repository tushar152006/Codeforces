import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fullWeeks = n / 7;
        int remainingDays = n % 7;

        int min = fullWeeks * 2;
        int max = fullWeeks * 2;

        if (remainingDays >= 2) {
            max += 2;
        } else if (remainingDays == 1) {
            max += 1;
        }

        if (remainingDays > 5) {
            min += remainingDays - 5;
        }

        System.out.println(min + " " + max);

        sc.close();
    }
}
