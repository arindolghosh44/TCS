import java.util.*;

public class isEqual{


	
	public static int isEqualThree(int p, int q , int r){

		int arr[]={p,q,r};

		Arrays.sort(arr);


		if(arr[0] == arr[1] && arr [1] == arr[2])

		return 0;







		int steps=0;
		while(true){


		arr[0]+=1;

		arr[1]+=1;

		arr[2]-=1;

		steps++;

		Arrays.sort(arr);

		if(arr[0] == arr[1] && arr [1] == arr[2])

		return steps;

		if((arr[0] == arr [1] && arr[1]+1 == arr[2]) ||(arr[1] == arr [2] && arr[0]+1 == arr[1]) )
			return -1;






		}













	}







	public static void main(String [] args){


	Scanner sc=new Scanner(System.in);

	int T=sc.nextInt();

	while(T-- > 0){

	int P=sc.nextInt();

	int Q=sc.nextInt();

	int R=sc.nextInt();


	System.out.println(isEqualThree(P,Q,R));


	}




		sc.close();


	}

















}