import java.util.*;


public class IndexOfOperator123{


	public static int foundryry(String text, String pattern){

		
	

		int M=text.length();

		int N=pattern.length();


		for(int i=0;i<M;i++){

		int temp=i;

		int j=0;//Must


		for(j=0;j<N;j++){

			if(text.charAt(temp)!= pattern.charAt(j)){

				break;

				}
		temp++;
			

			

		}

		if(j == N){

			return i;

		
		}
			






		}





		return -1;



	}





	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);


		String text=sc.nextLine();

		String pattern=sc.nextLine();



		int found=foundryry(text,pattern);



		System.out.println(found);















	}





















}