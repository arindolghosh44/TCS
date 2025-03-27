import java.util.*;
import java.io.*;

public class KthSmallestestUsingMaxHeap {

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

       PriorityQueue <Integer> pq=new PriorityQueue<>(Collections.reverseOrder());


	for(int i=0;i<n;i++){


		pq.offer(arr[i]);

		if(pq.size() > k){

			pq.poll();

		}



	}

		while(!pq.isEmpty()){
		System.out.println(pq.peek());
		pq.poll();
		}
    }
}
