import java.util.*;
import java.io.*;
//sum of its divisors excluding itself > given number
public class AbundentNumber{


	static boolean abun(int num){

		if (num<1) return false;

		int original=num;

		int sum=1;

			//O(log(n))
		for (int i=2;i<=num/2;i++){

			if(num%i==0)
				sum+=i;

		}


		return sum > original;

	}

	

	public static void main(String [] args) throws IOException{


	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

	
	String sk=bf.readLine();


	

	int num=Integer.parseInt(sk);


	

		if(abun(num)){

			System.out.println("abundent number"+" "+num);
			
		}


		else{
				System.out.println(" not abundent number"+" "+num);
			
		}




	}








}