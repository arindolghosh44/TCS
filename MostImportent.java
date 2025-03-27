import java.util.*;

import java.io.*;


public class MostImportent{




	public static void main(String [] args) throws IOException{


	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


	int t=Integer.parseInt(br.readLine());


	while(t-- > 0){

		String st=br.readLine();


		int x=0,y=0;


		for(char ch: st.toCharArray()){

			if(ch == 'U') y++;

			else if (ch == 'D') y--;

			else if(ch == 'L') x++;

			else if (ch == 'R') x--;





		}





	System.out.println(x+"    "+y);


	}



	

	}











}
