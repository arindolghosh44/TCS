import java.util.*;

public class RemovedDuplicateElements1{

	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int arr[]=new int[n];


		for(int i=0;i<n;i++){


			arr[i]=sc.nextInt();

		}


		//Using HashSet and also treeset

		LinkedHashSet<Integer> set=new LinkedHashSet<>();

		for(int num:arr)
			set.add(num);

		int result[]=new int [set.size()];

			int i=0;

		for(int num: set)

			result[i++]=num;


		
		System.out.println(" ");

		for(int k:result)
		System.out.print(k+" ");



	}



















}