import java.util.*;

public class ValidPair{



	public static int Valid(int [] arr,int x,int y){


	int count=0;

	List<String> list=new ArrayList<>();

	for(int i=0;i<arr.length;i++){


		for(int j=0;j<arr.length;j++){


			String Concate=String.valueOf(arr[i])+String.valueOf(arr[j]);

			int num=Integer.parseInt(Concate);

			if(num>=x && num<=y){

				count++;
				
				list.add("("+arr[i]+","+arr[j]+")");

				

			}






		}






	}










		System.out.println("valid pairs:"+list);

		return count;



	}

	public static void main(String [] args){


	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the Array Length:");

	int n=sc.nextInt();

	int [] arr=new int[n];

	System.out.println("Enter the Array Elements:");

	

	for(int i=0;i<n;i++){

		arr[i]=sc.nextInt();
	}


	
	System.out.println("Enter the Lower Limit:");

	int x=sc.nextInt();




	System.out.println("Enter the Higher Limit:");

	int y=sc.nextInt();


	int result=Valid(arr,x,y);

	System.out.println("Number of Valid Pair Possible:"+" "+result);






	}









}