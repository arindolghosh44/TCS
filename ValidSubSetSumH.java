import java.util.*;

public class ValidSubSetSumH{


	public static String result(int n,int [] arr,int sum){



	for(int i=0;i<n;i++){

		

		for(int j=0;j<n;j++){

			if(arr[i]+arr[j] == sum){

				System.out.println(arr[i]+" "+arr[j]);
				
				return "YES";

			}

			


		}






	}







	return "NO";


	}






	public static void main(String [] args){



	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the Number of Elements in the timeslot:");

	int n=sc.nextInt();

	int arr[]=new int[n];


	for(int i=0;i<n;i++){

		arr[i]=sc.nextInt();

	}
	
	int sum=sc.nextInt();



	System.out.println("Ans:"+" "+result(n,arr,sum));


	}




















}
		
