import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int pos = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 1) {
                    pos = i;
                    break;
                }
            }

            boolean clockwise = true;
            boolean counterClockwise = true;

            for (int i = 0; i < n; i++) {
                if (arr[(pos + i) % n] != i + 1) {
                    clockwise = false;
                }

                if (arr[(pos - i + n) % n] != i + 1) {
                    counterClockwise = false;
                }
            }

            System.out.println(clockwise || counterClockwise ? "YES" : "NO");
        }

        sc.close();
    }
}
