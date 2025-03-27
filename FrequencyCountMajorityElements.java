import java.util.*;



public class FrequencyCountMajorityElements{

	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int arr[]=new int[n];


		for(int i=0;i<n;i++){


			arr[i]=sc.nextInt();

		}


		
		Map<Integer,Integer> map=new HashMap<>();

		for(int i=0;i<n;i++){

			map.put(arr[i],map.getOrDefault(arr[i],0)+1);

		}



		for(int x:map.keySet()){

			if (map.get(x) > n/2){

				System.out.println(x);

				return;

			}


		}



			System.out.println(-1);
		

	}







}