import java.util.Scanner;

//for Strings
public class Palindrome1{


	static boolean IsPalindrome(String str){


		

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

		String str=sc.nextLine();


		System.out.println(IsPalindrome(str));










	}












}