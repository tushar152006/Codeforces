import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while (t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();

            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            int side = Math.max(a * 2, b);
            System.out.println(side * side);
        }

        scn.close();
    }
}
