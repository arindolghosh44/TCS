import java.util.*;


class ContiguousSubArrayk{


	public static List<Integer> solve(int [] arr,int k,int n){

		List<Integer> ans=new ArrayList<>();

		for(int i=0;i<=n-k;i++){

			int maxi=arr[i];

			for(int j=i;j<i+k;j++){
				
				if(arr[j]>maxi)
					maxi=arr[j];


			}

			ans.add(maxi);


		}
		





		return ans;

	}




	public static void main (String [] args){


		Scanner sc=new Scanner(System.in);



		int n=sc.nextInt();

		int arr[] = new int[n];

			
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();

			
		int k=sc.nextInt();

		
		
		System.out.println(solve(arr,k,n));











	}



















}