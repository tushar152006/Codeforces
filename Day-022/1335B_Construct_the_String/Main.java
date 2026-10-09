import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextInt();
            int b = sc.nextInt();

            for (int i = 0; i < n; i++) {
                output.append(alphabet.charAt(i % b));
            }
            output.append('\n');
        }

        System.out.print(output);
        sc.close();
    }
}
