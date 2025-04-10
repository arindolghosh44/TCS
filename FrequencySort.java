import java.util.*;

public class FrequencySort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 1, 2};

        // Step 1: Count frequency
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert array to list for sorting
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Step 3: Sort by frequency (desc), then value (asc)
        list.sort((a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            if (freqA != freqB) {
                return freqB - freqA; // Higher frequency comes first
            } else {
                return a - b; // Lower number comes first
            }
        });

        // Step 4: Print result
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
