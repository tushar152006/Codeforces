import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        char[] ch = word.toCharArray();

        ch[0] = Character.toUpperCase(ch[0]);

        System.out.println(ch);

    }
}