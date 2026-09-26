import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String song = sc.next();
        String result = song.replaceAll("WUB", " ")
                .replaceAll(" +", " ")
                .trim();

        System.out.println(result);
        sc.close();
    }
}
