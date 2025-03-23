import java.util.*;
import java.io.*;

public class Que9{



		public static void main(String [] args) throws IOException{


			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the Strings:");

			String s1=bf.readLine();

			String s2=bf.readLine();


			char [] arr=s1.toCharArray();

			char [] arr1=s2.toCharArray();


			Arrays.sort(arr);

			Arrays.sort(arr1);

			System.out.println(Arrays.equals(arr,arr1));

			


		}















}