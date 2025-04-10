import java.util.*;

public class CustomSort {

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] arr2 = {2, 1, 8, 3};

        // Step 1: Frequency count of arr1 using HashMap
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a result list and add elements in order of arr2
        List<Integer> result = new ArrayList<>();

        for (int num : arr2) {
            if (freqMap.containsKey(num)) {
                int count = freqMap.get(num);
                for (int i = 0; i < count; i++) {
                    result.add(num);
                }
                freqMap.remove(num); // Remove processed element
            }
        }

        // Step 3: Add remaining elements (not in arr2), sorted
        List<Integer> remaining = new ArrayList<>(freqMap.keySet());
        Collections.sort(remaining);

        for (int num : remaining) {
            int count = freqMap.get(num);
            for (int i = 0; i < count; i++) {
                result.add(num);
            }
        }

        // Step 4: Print result
        System.out.println("Custom sorted array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
