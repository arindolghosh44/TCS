import java.util.*;
import java.io.*;


public class FindSmallestElement{




	public static void main(String [] args) throws IOException{


	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	int n=Integer.parseInt(br.readLine());


	int arr[]=new int [n];


	for(int i=0;i<n;i++){

		arr[i]=Integer.parseInt(br.readLine());

	}


	System.out.println(" ");
	for(int i:arr)
		System.out.print(i+" ");


	Arrays.sort(arr);


	System.out.println("Largest"+":"+arr[n-1]);
	System.out.println("Smallest"+":"+arr[0]);

	}





}