import java.util.*;
import java.io.*;


public class MissingNumber{


	public static int Miss(int [] num,int n){


	int expected=(n*(n+1))/2;

	int asum=0;

	for(int i:num)
		asum+=i;

	

		return Math.abs(expected - asum);


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



	System.out.println("Missing Number is:"+" "+Miss(num,n));


	}









}