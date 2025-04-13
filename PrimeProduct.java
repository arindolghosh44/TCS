import java.util.*;

public class PrimeProduct{


	public static boolean isPrime(int num){


		if(num<=1) return false;

		for(int i=2;i*i<=num;i++){


			if(num % i == 0)

				return false;







		}






		return true;


	}








	public static int findPrime(int n){

		int count=0;

		int num=1;


		while(count<n){

		num++;

		if(isPrime(num)) count++;



		}



	return num;



	}







	public static void main(String [] args){



	Scanner sc=new Scanner(System.in);


	int n1=sc.nextInt();
	
	//sc.nextLine();

	int n2=sc.nextInt();

	
	int prime1=findPrime(n1);

	int prime2=findPrime(n2);


	int sum=(prime1*prime2)-1;

	System.out.println("Ans:"+" "+sum);

	
















	}




















}
		
