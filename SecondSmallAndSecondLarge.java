import java.util.*;
import java.io.*;

public class SecondSmallAndSecondLarge {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("\nArray elements:");
        for (int i : arr)
            System.out.print(i + " ");

        // Remove duplicates using a Set (optional depending on use case)
        Set<Integer> unique = new HashSet<>();
        for (int i : arr) {
            unique.add(i);
        }

        if (unique.size() < 2) {
            System.out.println("\nNot enough unique elements for second smallest and second largest.");
            return;
        }

        // Add unique elements to heaps
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : unique) {
            minHeap.offer(i);
            maxHeap.offer(i);
        }

	
        System.out.println("\nFirst Smallest: " +minHeap.peek());
        System.out.println("First Largest: " + maxHeap.peek());





        // Remove first smallest/largest
        minHeap.poll();
        maxHeap.poll();

        /*int secondSmallest = minHeap.poll();
        int secondLargest = maxHeap.poll();

        System.out.println("\nSecond Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);*/

	
        System.out.println("\nSecond Smallest: " +minHeap.peek());
        System.out.println("Second Largest: " + maxHeap.peek());



    }
}
