import java.util.Scanner;

public class LeapYear{


	static boolean check(int n){


	return (n % 400 == 0)||(n % 4 ==0 && n % 100 != 0);




	}
	


	public static void main(String [] args){


		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();


		if(check(n)){

			System.out.println("Yes");
		}

		else{


			System.out.println("No");
		}








	}












}