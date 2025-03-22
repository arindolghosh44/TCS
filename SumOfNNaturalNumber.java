import java.util.*;
import java.io.*;

public class SumOfNNaturalNumber{

		
	static int Sum(int n){


	return (n*(n+1))/2;

	}
	


	

	public static void main(String [] args) throws IOException{


	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));


	String sk=bf.readLine();

	int num=Integer.parseInt(sk);

	int n=Sum(num);

	System.out.println("sum Number:"+" "+n);










	}








}