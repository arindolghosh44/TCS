import java.util.*;


class LongestWordInASentence{






	public static void main (String [] args){


		Scanner sc=new Scanner(System.in);



		String str=sc.nextLine();


		String [] words=str.split(" ");


		String longest="";

		for(String word :words){
			if(word.length()> longest.length())

				longest=word;

		}



			System.out.println(longest);
	}



















}