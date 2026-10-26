import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder answer = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            String problems = sc.next();
            Set<Character> solved = new HashSet<>();
            int balloons = 0;

            for (int i = 0; i < n; i++) {
                char problem = problems.charAt(i);
                balloons += solved.add(problem) ? 2 : 1;
            }

            answer.append(balloons).append('\n');
        }

        System.out.print(answer);
        sc.close();
    }
}
