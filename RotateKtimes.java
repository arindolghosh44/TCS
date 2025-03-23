import java.util.*;
import java.io.*;


public class RotateKtimes{


	public static void rotate(int [] num,int n,int k){

	k=k%n;

	swap(num,0,n-1);
	swap(num,0,k-1);
	swap(num,k,n-1);


	}

	static void swap(int [] num,int i,int j){


		while(i<j){

		int temp=num[i];

		num[i]=num[j];

		num[j]=temp;

		i++;

		j--;






		}


	}






	public static void main(String [] args) throws IOException{



	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter the size of the array:");

	int n=Integer.parseInt(bf.readLine());

	
	System.out.println("Enter the elements of the array:");

	int num[]=new int[n];

	for(int i=0;i<n;i++){
		
		num[i]=Integer.parseInt(bf.readLine());

	}

	System.out.println("Enter the value of k:");

		int k=Integer.parseInt(bf.readLine());
	
	rotate(num,n,k);

	System.out.println(" ");


	for(int i:num)

		System.out.print(i+" ");

	


	}









}