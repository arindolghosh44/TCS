import java.util.*;
import java.io.*;

public class UpperLower{




	public static void main(String [] args) throws IOException{

	InputStreamReader io=new InputStreamReader(System.in);

	BufferedReader br=new BufferedReader(io);


	String [] str=br.readLine().split(" ");

	int n=Integer.parseInt(str[0]);

	int l=Integer.parseInt(str[1]);

	int u=Integer.parseInt(str[2]);

	int arr[]=new int [n];

	System.out.println("Enter the Elements:");

	String [] str1=br.readLine().split(" ");

	for(int i=0;i<n;i++){

		arr[i]=Integer.parseInt(str1[i]);

	}


	for(int i=0;i<n;i++){
		
		System.out.print("["+l+","+(arr[i]-1)+"]");
		l=arr[i]+1;

	}


	System.out.print("["+l+","+u+"]");















	}



















}