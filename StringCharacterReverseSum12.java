import java.util.*;

public class StringCharacterReverseSum12{



	public static boolean reverseSum(String str){


		
		String str1=new StringBuilder(str).reverse().toString();
			
		int sum=0;

		int sum1=0;

		for(char ch:str.toCharArray()){

			sum+=ch - '0';

		}


		for(char ch:str1.toCharArray()){

			sum1+=ch - '0';

		}


		return sum == sum1;



	}




	public static void main(String [] args){

	Scanner sc = new Scanner (System.in);

	String str=sc.nextLine();

	if(reverseSum(str)){

		System.out.println("Yes");


	}


	else{

			System.out.println("NO");

	}

	}


















}


