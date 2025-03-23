import java.util.*;
import java.io.*;

public class Que8{



		public static void main(String [] args) throws IOException{


			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the String:");

			String s=bf.readLine();

			System.out.println("Enter the L:");

			int L=Integer.parseInt(bf.readLine());

			
			
			int count=0;
			
			int maxAqua=0;


			for(int i=0;i<s.length();i++){

				if(i % L == 0){

				maxAqua = Math.max(maxAqua,count);
				
				count=0;
				}
			
				if(s.charAt(i) == 'a')

					count++;



			}


			maxAqua = Math.max(maxAqua,count);

			System.out.println(" ");
			System.out.println(maxAqua);


		}















}