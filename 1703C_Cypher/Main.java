import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder answer = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] digits = new int[n];

            for (int i = 0; i < n; i++) {
                digits[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                int moves = sc.nextInt();
                String instructions = sc.next();

                for (int j = 0; j < moves; j++) {
                    if (instructions.charAt(j) == 'D') {
                        digits[i] = (digits[i] + 1) % 10;
                    } else {
                        digits[i] = (digits[i] + 9) % 10;
                    }
                }
            }

            for (int digit : digits) {
                answer.append(digit).append(' ');
            }
            answer.append('\n');
        }

        System.out.print(answer);
        sc.close();
    }
}
