import java.util.*;

// HashMap Example
public class que91 {

    static void Calculate(String str) {

        // Check for null or empty input
        if (str == null || str.isEmpty()) {
            System.out.println("Invalid Input");
            return;
        }

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> map = new HashMap<>();

        char firstNonRepeating = '\0'; // Initialize to null character
        char firstRepeating = '\0'; // Initialize to null character

        // Count character frequencies
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find the first non-repeating character
        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                firstNonRepeating = c;
                break;
            }
        }

        // Find the first repeating character
        for (char c : str.toCharArray()) {
            if (map.get(c) > 1) {
                firstRepeating = c;
                break;
            }
        }

        // Display the results
        if (firstNonRepeating != '\0') {
            System.out.println("First Non-Repeating Character: " + firstNonRepeating);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }

        if (firstRepeating != '\0') {
            System.out.println("First Repeating Character: " + firstRepeating);
        } else {
            System.out.println("No Repeating Character Found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");

        String p = sc.nextLine();

        Calculate(p);

        sc.close();
    }
}
