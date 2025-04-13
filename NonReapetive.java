import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class NonReapetive{



	public static void main(String [] args){


	Scanner sc=new Scanner(System.in);

	int n=sc.nextInt();

	int arr[]=new int [n];


	for(int i=0;i<n;i++){


		arr[i]=sc.nextInt();



	}


	Map<Integer,Integer> map=new HashMap<>();


	for(int i:arr)
		map.put(i,map.getOrDefault(i,0)+1);

	System.out.println(" ");
	for(Map.Entry<Integer,Integer> en: map.entrySet()){
		
		if(en.getValue() == 1){
			System.out.println("Ans is:"+" "+en.getKey());
		break;
	}
	}















	}

















}