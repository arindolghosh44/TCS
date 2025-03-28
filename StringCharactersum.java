import java.util.*;

public class StringCharactersum{




	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);


		String str=sc.nextLine();

		int sum=0;


		for(char ch:str.toCharArray()){

			if(Character.isDigit(ch))

				sum+=Character.getNumericValue(ch);




		}


		System.out.println(sum);


	}



















}