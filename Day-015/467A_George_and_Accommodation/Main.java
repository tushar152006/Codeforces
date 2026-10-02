import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfRooms = scanner.nextInt();
        int availableRooms = 0;

        for (int i = 0; i < numberOfRooms; i++) {
            int currentOccupants = scanner.nextInt();
            int roomCapacity = scanner.nextInt();

            if (roomCapacity - currentOccupants >= 2) {
                availableRooms++;
            }
        }

        System.out.println(availableRooms);
    }
}