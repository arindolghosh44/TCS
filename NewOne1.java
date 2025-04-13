import java.util.*;
import java.io.*;

// Input Taken AS Single Line
public class NewOne1{


	public static  int Cal(int n,int l,int u,int [] arr){


	int sum=0;

	
	for(int i=0;i<n;i++){

		String k= String.valueOf(arr[i]);

		for(int j=0;j<n;j++){

			String p= String.valueOf(arr[j]);

			String con=k+p;

			int r=Integer.parseInt(con);


			if(r>=l && r<=u)
				sum++;

		}


	}












	return sum;

	}



	public static void main(String [] args) throws IOException{


     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the Size: ");
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        System.out.print("Enter the lower and upper range (space-separated): ");
        String[] range = br.readLine().split(" ");
        int l = Integer.parseInt(range[0]);
        int u = Integer.parseInt(range[1]);

        System.out.println("Enter the elements:");
        String[] elements = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(elements[i]);
        }

        System.out.println("Ans: " + Cal(n, l, u, arr));

	}











}