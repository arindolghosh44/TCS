import java.util.*;

public class Que1{




	public static void main(String [] args){



	Scanner sc=new Scanner(System.in);

	String str=sc.nextLine();

	
	int count=0;

	for(int i=0;i<str.length();i++){

	int sum=0;

		for(int j=i;j<str.length();j++){

			sum+=str.charAt(j)-'0';

				if(sum!=(j-i+1))
					count++;


		}




	}












			System.out.println(count);



	}












}