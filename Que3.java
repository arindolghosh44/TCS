import java.util.*;
import java.io.*;

public class Que3{



		public static void main(String [] args) throws IOException{


			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the size of the array:");

			int n=Integer.parseInt(bf.readLine());

			
			System.out.println("Enter the elements of the array:");

			int [] num=new int[n];
			
			for(int i=0;i<n;i++){


				
				num[i]=Integer.parseInt(bf.readLine());


			}

			int [] temp=num.clone();

			Arrays.sort(temp);

			Map<Integer,Integer> map=new HashMap<>();


			int rank=1;
			
			for(int i=0;i<n;i++){

				if(!map.containsKey(temp[i])){

					map.put(temp[i],rank);

				rank++;
				}


			}



			for(int i=0;i<n;i++){

				num[i]=map.get(num[i]);


			}

			for(int i=0;i<n;i++){

				System.out.print(num[i]+" ");

			}
			





		}















}