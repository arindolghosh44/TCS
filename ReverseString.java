import java.util.*;

public class ReverseString{


	public static void main(String [] args){



	Scanner sc=new Scanner(System.in);

	
	String str=sc.nextLine();

	String [] words = str.trim().split("\\s+");

	
	
      StringBuilder sb=new StringBuilder();


	for(int i=words.length-1;i>=0;i--){

		sb.append(words[i]);

		if(i!=0) sb.append(" ");

	}




	System.out.println(sb.toString());







	}





















}