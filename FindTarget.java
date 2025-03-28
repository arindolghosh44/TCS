import java.util.*;

public class FindTarget{



	static ArrayList<Integer> solve(int [] arr,int n,int target){

	ArrayList<Integer> ans=new ArrayList<>();


	for(int i=0;i<n;i++){


		int sum=0;

			for(int j=i;j<n;j++){

				sum+=arr[j];


				if(sum == target){


					ans.add(i+1);

					ans.add(j+1);


					return ans;



				}







			}








	}


	ans.add(-1);


	return ans;



	}



	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);


		System.out.println("Enter size of the array:");

		int n=sc.nextInt();


		int arr[]=new int [n];


		System.out.println("Enter the elements of the array:");

		for(int i=0;i<n;i++){

			arr[i]=sc.nextInt();


		}

		System.out.println("Enter target Value of the array:");

		int target=sc.nextInt();


		


		ArrayList<Integer> list=solve(arr,n,target);


		System.out.println(" ");


		for(int ele: list)

				System.out.print(ele+" ");



	}



















}