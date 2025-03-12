import java.util.Scanner;

public class DivisibleByNine{


	static boolean check(String n){


	int digit=0;

	for(int i=0;i<n.length();i++)
		{

			digit+=(n.charAt(i)-'0');
		}



	return (digit % 9 == 0);




	}
	


	public static void main(String [] args){


		Scanner sc=new Scanner(System.in);

		String n=sc.nextLine();


		if(check(n)){

			System.out.println("Yes");
		}

		else{


			System.out.println("No");
		}








	}












}