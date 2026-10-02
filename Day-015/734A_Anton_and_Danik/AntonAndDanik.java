import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGames = scanner.nextInt();
        String results = scanner.next();

        int antonWins = 0;
        int danikWins = 0;

        for (char result : results.toCharArray()) {
            if (result == 'A') {
                antonWins++;
            } else {
                danikWins++;
            }
        }

        if (antonWins > danikWins) {
            System.out.println("Anton");
        } else if (danikWins > antonWins) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}