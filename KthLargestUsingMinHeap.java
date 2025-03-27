import java.util.*;
import java.io.*;

public class KthLargestUsingMinHeap {

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

       PriorityQueue <Integer> pq=new PriorityQueue<>();


	for(int i=0;i<n;i++){


		pq.offer(arr[i]);

		if(pq.size() > k){

			pq.poll();

		}



	}


		System.out.println(pq.peek());
    }
}
