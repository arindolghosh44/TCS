import java.util.*;
import java.io.*;


public class FindSmallestElement1{




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


	int max=Integer.MIN_VALUE;

	int min=Integer.MAX_VALUE;


	/*for(int i: arr){

		max=Math.max(max,i);

		min=Math.min(min,i);

	}*/

	for(int i: arr){

		if(i>max)
			max=i;

		if(i<min)

			min=i;

	}


	
	







	System.out.println(" ");
	System.out.println("Largest"+":"+max);
	System.out.println("Smallest"+":"+min);

	}





}