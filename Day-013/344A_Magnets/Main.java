import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int groups = 1;
        String previous = reader.readLine();

        for (int i = 1; i < count; i++) {
            String current = reader.readLine();
            if (current.charAt(0) != previous.charAt(0)) {
                groups++;
            }
            previous = current;
        }

        System.out.println(groups);
    }
}