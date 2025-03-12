import java.util.Scanner;

public class FloatingPointNumberEvenOdd{


	static String isEven(String st,int n){

		for(int i=n-1;i>=0;i--){

			
		char ch=st.charAt(i);

			if(ch>='1' && ch<='9'){

				int digit=ch-'0';

				return (digit % 2 == 0) ? "Even":"ODD";
			}


		}
	

		return "EVEN";


	}
	


	public static void main(String [] args){


		Scanner sc=new Scanner(System.in);

		String s1=sc.nextLine();


		System.out.println(isEven(s1,s1.length()));







	}












}