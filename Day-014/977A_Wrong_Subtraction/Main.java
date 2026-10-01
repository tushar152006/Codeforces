import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int operations = scanner.nextInt();

        while (operations-- > 0) {
            if (number % 10 == 0) {
                number /= 10;
            } else {
                number--;
            }
        }

        System.out.println(number);
    }
}