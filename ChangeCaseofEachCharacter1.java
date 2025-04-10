import java.util.*;



public class ChangeCaseofEachCharacter1{

	public static String solve(String str,int n){



		StringBuffer sb= new StringBuffer();

		for(int i=0;i<n;i++){

			int index=(int)str.charAt(i);
			
			if(index>=65 && index<=90)
					sb.append(Character.toLowerCase((char) index));


			else if(index>=97 && index<=122)
					sb.append(Character.toUpperCase((char) index));

			else if(str.charAt(i) == ' ')
					sb.append(' ');

			


		}








		return sb.toString();


	}


	public static void main(String [] args){


		Scanner sc=new Scanner(System.in);


		String str=sc.nextLine();


		System.out.println(str);



		System.out.println(solve(str,str.length()));






	}















}