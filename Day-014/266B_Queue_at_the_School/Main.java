import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();
        int seconds = scanner.nextInt();
        char[] queue = scanner.next().toCharArray();

        for (int second = 0; second < seconds; second++) {
            for (int index = 0; index < students - 1; index++) {
                if (queue[index] == 'B' && queue[index + 1] == 'G') {
                    char temp = queue[index];
                    queue[index] = queue[index + 1];
                    queue[index + 1] = temp;
                    index++;
                }
            }
        }

        System.out.println(new String(queue));
    }
}