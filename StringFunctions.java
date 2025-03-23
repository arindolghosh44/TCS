import java.util.*;
import java.io.*;

public class StringFunctions{



	public static void main(String [] args){




	Scanner sc=new Scanner(System.in);

	String str=sc.nextLine();

	
	String [] arr=str.split(",");


	List<Integer> list=new ArrayList<>();

	for(String i:arr){

	list.add(Integer.parseInt(i));

	}


	for(int i:list)
		System.out.print(i+" ");







	}















}