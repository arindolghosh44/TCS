import java.util.*;
import java.io.*;

public class Que5{



		public static void main(String [] args) throws IOException{


			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the size of the array:");

			int n=Integer.parseInt(bf.readLine());

			
			System.out.println("Enter the elements of the array:");

			int [] arr=new int[n];
			
			for(int i=0;i<n;i++){


				
				arr[i]=Integer.parseInt(bf.readLine());


			}

			int count0=0;

			int count1=0;

			int count2=0;

			

			
			

			for(int i=0;i<n;i++)

			{
				if(arr[i] == 0)

					count0++;


				else if(arr[i] == 1)

					count1++;


				else if(arr[i] == 2)

					count2++;
				
				




			}

				int idx=0;

			while(count0>0)

			{

				arr[idx]=0;

				idx++;


				count0--;

			}

			while(count1>0)

			{

				arr[idx]=1;

				idx++;


				count1--;

			}


			while(count2>0)

			{

				arr[idx]=2;

				idx++;


				count2--;

			}




			for(int i=0;i<n;i++){

				System.out.print(arr[i]+" ");

			}
			





		}















}