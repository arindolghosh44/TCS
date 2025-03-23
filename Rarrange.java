import java.util.*;
import java.io.*;


public class Rarrange{


	static void rearrange(int [] num,int n){


		List<Integer> posi=new ArrayList<>();
		List<Integer> negi=new ArrayList<>();
		
		for(int i=0;i<n;i++){

			if(num[i]>0)
				posi.add(num[i]);


			else if(num[i]<0)
				negi.add(num[i]);

		}

		int arr[]=new int[n];

		int k=0;

		int c=0;

		while(c<posi.size()){
		
		arr[k]=posi.get(c);

		arr[k+1]=negi.get(c);

		k+=2;

		c++;




		}
		System.out.println(" ");

		for(int i=0;i<n;i++){

			System.out.print(arr[i]+" ");

		}




	}



	public static void main(String [] args) throws IOException{



	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter the size of the array:");

	int n=Integer.parseInt(bf.readLine());

	
	System.out.println("Enter the elements of the array:");

	int num[]=new int[n];

	for(int i=0;i<n;i++){
		
		num[i]=Integer.parseInt(bf.readLine());

	}



	rearrange(num,n);


	}









}