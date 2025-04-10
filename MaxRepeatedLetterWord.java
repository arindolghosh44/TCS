import java.util.*;


public class MaxRepeatedLetterWord{

	
	public static String solve(String str,int n){


		String [] arr=str.split(" ");


		String result = "-1";

		int maxRepeated=0;

		for(String word:arr){

			Map<Character,Integer> freq = new HashMap<>();

			int localMax=0;

			for(char ch : word.toCharArray()){

				freq.put(ch,freq.getOrDefault(ch,0)+1);

				localMax=Math.max(localMax,freq.get(ch));


			}
				 // Only consider words where some letter is repeated localMax > 1 

				if(localMax > 1 && localMax > maxRepeated){

					maxRepeated=localMax;

					result=word;


				}


		}







		return result;


	}








	public static void main(String [] args){



		Scanner sc=new Scanner(System.in);


		String str=sc.nextLine();


		
		
		System.out.println(solve(str,str.length()));














	}






















}