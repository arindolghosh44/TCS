import java.util.*;

public class FrequencyCount13{




	public static void main(String [] args){

	Scanner sc=new Scanner(System.in);


	int n=sc.nextInt();

	int arr[]=new int [n];

	for(int i=0;i<n;i++){
		
		arr[i]=sc.nextInt();

	}


	Map<Integer,Integer> map=new HashMap<>();


	for(int i:arr){

		
		 map.put(i, map.getOrDefault(i, 0) + 1);

	}


	for(Map.Entry<Integer,Integer> entry: map.entrySet()){


		System.out.println("key"+" "+entry.getKey()+" "+"Value"+" "+entry.getValue());


	}









	}


















}