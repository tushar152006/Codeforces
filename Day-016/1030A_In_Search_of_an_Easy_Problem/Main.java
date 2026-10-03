import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean hard = false;

        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) {
                hard = true;
                break;
            }
        }

        System.out.println(hard ? "HARD" : "EASY");
    }
}
