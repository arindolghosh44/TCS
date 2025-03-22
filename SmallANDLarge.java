import java.util.*;
import java.io.*;

class SmallANDLarge{

	public static void main(String [] args) throws IOException{


	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));


	String sk=bf.readLine();

	int N=Integer.parseInt(sk);


	int maxDigit=0;//We use different in Integer.MIN_VALUE

	int minDigit=9;////We use different in Integer.MAX_VALUE


	while(N>0){
		 
		int digit=N%10;

		maxDigit=Math.max(maxDigit,digit);

		minDigit=Math.min(minDigit,digit);

		N/=10;

	}


	System.out.println("Maximum Number:"+" "+maxDigit);
	System.out.println("Minimum Number:"+" "+minDigit);









	}








}