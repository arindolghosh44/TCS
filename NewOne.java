import java.util.*;

// Input Taken AS Single Line
public class NewOne{


	public static  int Cal(int n,int l,int u,int [] arr){


	int sum=0;

	
	for(int i=0;i<n;i++){

		String k= String.valueOf(arr[i]);

		for(int j=0;j<n;j++){

			String p= String.valueOf(arr[j]);

			String con=k+p;

			int r=Integer.parseInt(con);


			if(r>=l && r<=u)
				sum++;

		}


	}












	return sum;

	}



	public static void main(String [] args){



	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the Size :");
	
	int n=sc.nextInt();

	 sc.nextLine();  // Consume leftover newline

	int arr[]=new int [n];


		System.out.println("Enter the lower and Upper Range :");

		String [] str=sc.nextLine().split(" ");

		int l=Integer.parseInt(str[0]);

		int u=Integer.parseInt(str[1]);


		
		System.out.println("Enter the elements :");

		String [] str1=sc.nextLine().split(" ");


		

	for(int i=0;i<n;i++){

	arr[i]=Integer.parseInt(str1[i]);

	}


	System.out.println("Ans:"+" "+Cal(n,l,u,arr));

	}











}