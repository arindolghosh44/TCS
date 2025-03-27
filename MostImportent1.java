import java.util.*;

import java.io.*;


public class MostImportent1{




	public static void main(String [] args) throws IOException{


	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


	int t=Integer.parseInt(br.readLine());


	while(t-- > 0){

		String st=br.readLine();

		int sum=0;

		for(char ch: st.toCharArray()){

			sum+=Character.getNumericValue(ch);
			

		}


		if(sum % 4 == 0)

			System.out.println("OPEN");


		else

			System.out.println("LOCKED");


	


	}



	

	}











}
