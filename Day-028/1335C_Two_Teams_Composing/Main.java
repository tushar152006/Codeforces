import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            Map<Integer, Integer> frequencies = new HashMap<>();
            Set<Integer> distinctValues = new HashSet<>();

            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                frequencies.put(value, frequencies.getOrDefault(value, 0) + 1);
                distinctValues.add(value);
            }

            int maxFrequency = 0;
            for (int frequency : frequencies.values()) {
                maxFrequency = Math.max(maxFrequency, frequency);
            }

            int distinctCount = distinctValues.size();
            int answer = Math.min(distinctCount, maxFrequency);
            if (distinctCount == maxFrequency) {
                answer--;
            }

            System.out.println(answer);
        }

        sc.close();
    }
}
