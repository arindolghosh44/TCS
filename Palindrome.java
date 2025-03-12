import java.util.Scanner;

public class Palindrome{


	static boolean IsPalindrome( int n){


		String str=Integer.toString(n);

		int left=0, right=str.length()-1;

		while(left<right){

			if(str.charAt(left)!=str.charAt(right))
				return false;

			left++;

			right--;



		}




	return true;




	}
	


	public static void main(String [] args){


		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();


		System.out.println(IsPalindrome(n));










	}












}