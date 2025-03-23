import java.util.*;

public class Que2{




	public static void main(String [] args){



	Scanner sc=new Scanner(System.in);

	String str=sc.nextLine();
			str.toLowerCase();
	
		//no Duplicate
		Set<Character> set=new HashSet<>();

		
		
		for(char ch:str.toCharArray())
			{

			if(ch >='a' && ch<='z')
			set.add(ch);
			}


		StringBuilder st=new StringBuilder();

		for(char ch='a';ch<='z';ch++){


			if(!set.contains(ch))
				st.append(ch);






		}




			if(st.length() == 0)

				System.out.println(0);


			else{

				System.out.println(st.toString());

				}






			



	}












}