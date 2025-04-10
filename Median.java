import java.util.*;

public class Median {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int[] arr1 = {2, 5, 1, 7};

        Arrays.sort(arr);
        Arrays.sort(arr1);

        System.out.println("Median of arr: " + findMedian(arr));
        System.out.println("Median of arr1: " + findMedian(arr1));
    }

    static double findMedian(int[] arr) {
        int n = arr.length;
        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
            return (arr[n / 2] + arr[n / 2 - 1]) / 2.0;
        }
    }
}
