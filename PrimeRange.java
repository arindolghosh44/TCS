import java.util.*;
import java.io.*;

public class PrimeRange{


	public static boolean isPrime(int n){

		if(n<2) return false;


	for(int i=2;i<=Math.sqrt(n);i++){

		if(n % 2 == 0) return false;



	}


	return true;

	}







	public static void main(String [] args) throws IOException{


	InputStreamReader io=new InputStreamReader(System.in);

	BufferedReader br=new BufferedReader(io);


	int n=Integer.parseInt(br.readLine());
		int sum=0;

	for(int i=2;i<=n;i++){
		if(isPrime(i)){
			System.out.println(i);
			sum+=i;
		}
	}

	System.out.println("Sum Is :"+" "+sum);

		
	}

















}