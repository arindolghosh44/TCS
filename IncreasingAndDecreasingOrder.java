import java.util.*;

public class IncreasingAndDecreasingOrder{




	public static void main(String [] args){

	Scanner sc=new Scanner(System.in);


	int n=sc.nextInt();

	int arr[]=new int [n];

	for(int i=0;i<n;i++){
		
		arr[i]=sc.nextInt();

	}

	
		Arrays.sort(arr);

		System.out.println(" ");


	for(int i=0;i<n/2 ;i++)

		System.out.print(arr[i]+" ");


	for(int i=n-1;i>=n/2;i--)

		System.out.print(arr[i]+" ");






	}


















}