import java.util.*;
import java.io.*;
public class Factorial{


	static int fact(int num){

		int s=1;


		for(int i=2;i<=num;i++){

			s=s*i;

		}

		return s;

	}

	

	public static void main(String [] args) throws IOException{


	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

	
	String sk=bf.readLine();


	

	int num=Integer.parseInt(sk);

		if(num<0){

			System.out.println("Not defined for negative number");
			
		}


		else{

			System.out.println("the factorial of :"+" "+num+" "+"is"+" "+fact(num));
		}




	}








}