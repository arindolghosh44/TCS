import java.util.*;
import java.io.*;

public class ARMSTRONG{


	static boolean isArm(int num){

		int original=num;

		int sum=0;

		int temp=num;

		//count the digit
		int digits=0;

		while(temp>0){

			temp/=10;
			digits++;
			
		}

		temp=num;

		while(temp>0){

			int digit=temp%10;

			sum+=Math.pow(digit,digits);

			temp/=10;




		}


		




		return sum == original;


	}

	public static void main(String [] args) throws IOException{


	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));


	String sk=bf.readLine();

	int num=Integer.parseInt(sk);

	

	if(isArm(num)){

		System.out.println("ArmStrong Number:"+" "+num);

	}


	else{

		System.out.println(" NOT ArmStrong Number:"+" "+num);

	}










	}








}