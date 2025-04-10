import java.util.*;


public class Secondsmallest3{




	public static void main(String [] args){


	Scanner sc=new Scanner(System.in);



	int n=sc.nextInt();


	int arr[]=new int [n];


	for(int i=0;i<n;i++){

		arr[i]=sc.nextInt();

	}

	int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;


	for(int i:arr){

		if(i<min){

			secondMin=min;

		min=i;

		}else if (i < secondMin && i != min) {
                secondMin = i;
            }

		
		if(i > max){

			secondMax=max;

		max=i;

		}else if (i > secondMax && i != max) {
                secondMax = i;
            }

	}


	System.out.println(max);

	System.out.println(min);


	System.out.println(secondMax);

	System.out.println(secondMin);













	}


























}