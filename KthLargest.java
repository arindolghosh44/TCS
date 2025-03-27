import java.util.*;
import java.io.*;

public class KthLargest {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array:");

        int n = Integer.parseInt(br.readLine());

        Integer arr[] = new Integer[n];  // Use Integer instead of int

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the k:");

        int k = Integer.parseInt(br.readLine());

        // Sort array in reverse order
        Arrays.sort(arr, Collections.reverseOrder());

        if (k <= n) {
            System.out.println("k-th largest element is: " + arr[k - 1]);
        } else {
            System.out.println("Invalid value of k!");
        }
    }
}
