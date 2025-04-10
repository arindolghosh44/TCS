import java.util.*;


public class ReverseArray{




	public static void main(String [] args){


	Scanner sc=new Scanner(System.in);



	int n=sc.nextInt();


	int arr[]=new int [n];


	for(int i=0;i<n;i++){

		arr[i]=sc.nextInt();

	}

	System.out.println(" ");


	for(int i:arr)
		System.out.print(i+" ");

	int ans[]=new int [n];
	for(int i=n-1;i>=0;i--)

	{

		ans[n-1-i]=arr[i];


	}



	System.out.println(" ");


	for(int i:ans)
		System.out.print(i+" ");







	}


























}