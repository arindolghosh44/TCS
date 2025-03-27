import java.util.*;

public class RemovedDuplicateElements{



	static int remove(int [] arr,int n){


		int index=1;

		for(int i=1;i<n;i++){
			
				if(arr[i]!=arr[i-1])
			arr[index++]=arr[i];

		}

		return index;



	}




	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int arr[]=new int[n];


		for(int i=0;i<n;i++){


			arr[i]=sc.nextInt();

		}


		


		int length=remove(arr,n);

		System.out.println(Arrays.toString(Arrays.copyOf(arr,length)));



	}



















}