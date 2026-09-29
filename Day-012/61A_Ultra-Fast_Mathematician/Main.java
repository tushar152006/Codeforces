import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.next();
        String second = sc.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < first.length(); i++) {
            result.append(first.charAt(i) == second.charAt(i) ? '0' : '1');
        }

        System.out.println(result);
        sc.close();
    }
}