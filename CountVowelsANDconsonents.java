import java.util.*;

public class CountVowelsANDconsonents{




	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);


		String str=sc.nextLine().toLowerCase();

		int v=0;

		int c=0;

		for(char ch:str.toCharArray()){

			if(Character.isLetter(ch)){

				if("aeiou".indexOf(ch)!= -1){

					v++;


				}

				else
					{


						c++;
					}




			}

				




		}


		System.out.println(v+"  "+c);


	}



















}