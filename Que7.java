import java.util.*;
import java.io.*;

public class Que7{



		public static void main(String [] args) throws IOException{


			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the Number:");

			int n=Integer.parseInt(bf.readLine());

			
			
			
				int res=1;
			while(n>0){

				int digit=n%10;

				res=res*digit;

				n=n/10;
			



			}


			System.out.println(res);



		}















}