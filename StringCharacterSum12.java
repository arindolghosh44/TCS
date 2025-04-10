import java.util.*;

public class StringCharacterSum12{




	public static void main(String [] args){

	Scanner sc = new Scanner (System.in);

	String str=sc.nextLine();


	int sum=0;


	for(char ch: str.toCharArray()){



	sum += ch - '0';




	}



	System.out.println(sum);
		

	}


















}


