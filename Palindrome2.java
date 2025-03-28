import java.util.Scanner;

//for Strings
public class Palindrome2{


	public static void main(String [] args){


		Scanner sc=new Scanner(System.in);

		String str=sc.nextLine();


		String rev=new StringBuilder(str).reverse().toString();



		if(str.equals(rev)){
			System.out.println("YES");

		}

		else{

			System.out.println("NO");


		}




	}












}