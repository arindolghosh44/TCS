import java.util.*;
import java.io.*;
//871659
public class FirstHalfIncreasingSecondHalfDecreasing{


	static void As(int [] n,int num){


		Arrays.sort(n);

		//first Half ascending
		for(int i=0;i<(num+1)/2;i++){

			System.out.print(n[i]+" ");

		}

		//second half decending
		for(int i=num-1;i>=(num+1)/2;i--){

			System.out.print(n[i]+" ");

		}






	}

	

	public static void main(String [] args) throws IOException{


	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter the size of the array:");
	String sk=bf.readLine();


	

	int num=Integer.parseInt(sk);

	
	int [] p=new int [num];

	System.out.println("Enter the elements of the array :");

	for(int i=0;i<num;i++){
	
		p[i]=Integer.parseInt(bf.readLine());


	}


	As(p,num);




	}








}