import java.util.*;
import java.io.*;

public class NonEmptySubString {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size String:");

       String str = br.readLine();

      int  n=str.length();
	for(int i=0;i<n;i++){

		for(int j=i+1;j<=n;j++){

				System.out.println(str.substring(i,j));

		}



	}

	System.out.println("Number of subString:"+" "+((n*(n+1))/2));
	
    }
}
