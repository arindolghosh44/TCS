import java.util.*;
import java.io.*;

public class Que4{



		public static void main(String [] args) throws IOException{


			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the size of the array:");

			int n=Integer.parseInt(bf.readLine());

			
			System.out.println("Enter the elements of the array:");

			int [] arr=new int[n];
			
			for(int i=0;i<n;i++){


				
				arr[i]=Integer.parseInt(bf.readLine());


			}

			
				int idx=0;

			for(int i=0;i<n;i++)

			{

				if(arr[i]!=0){
					
					arr[idx++]=arr[i];


				}





			}



				for(int i=idx;i<n;i++)

			{

					
					arr[i]=0;


				





			}




			for(int i=0;i<n;i++){

				System.out.print(arr[i]+" ");

			}
			





		}















}