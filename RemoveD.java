import java.util.*;

public class RemoveD{


	public static void main(String [] args){



	Scanner sc=new Scanner(System.in);

	String str = sc.nextLine();

	Set<Character> set=new TreeSet<>();

	for(char ch:str.toCharArray()){

	set.add(ch);

	}
	

	StringBuilder sb = new StringBuilder();

        Iterator<Character> it = set.iterator();

        while (it.hasNext()) {
            sb.append(it.next());
        }


	System.out.println("ANS IS:"+" "+sb.toString());







	}




















}
		
