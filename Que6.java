import java.util.*;
import java.io.*;

public class Que6{



		public static void main(String [] args) throws IOException{


			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the size of the array:");

			int n=Integer.parseInt(bf.readLine());

			
			System.out.println("Enter the elements of the array:");

			int [] arr=new int[n];
			
			for(int i=0;i<n;i++){


				
				arr[i]=Integer.parseInt(bf.readLine());


			}

			int max=Integer.MIN_VALUE;

			int count=0;
			for(int i=0;i<n;i++){


			if(arr[i]>max){

				max=arr[i];


				count++;





			}




			}


			System.out.println(count);



		}















}