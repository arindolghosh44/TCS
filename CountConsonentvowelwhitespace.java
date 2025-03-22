import java.util.*;
import java.io.*;

public class CountConsonentvowelwhitespace{


	static void count(String st,int l){


		int vowels=0;

		int cons=0;

		int whitespace=0;


		for(int i=0;i<l;i++){


		char ch=st.charAt(i);

		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			vowels++;


		else if (ch >= 'a' && ch <='z')
			cons++;

		else if (ch == ' ')

			whitespace++;



		}

		System.out.println("vowels"+" "+vowels);

		System.out.println("consonent"+" "+cons);

		System.out.println("whitespace"+" "+whitespace);



	}








	public static void main(String [] args) throws IOException{


	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

	
	String sk=bf.readLine();

	String st=sk.toLowerCase();
	

	count(st,st.length());		
			
		




	}








}