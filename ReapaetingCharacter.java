import java.util.*;

//LinkedHashMap
public class ReapaetingCharacter{

	static void Calculate(String str){

		if(str == null || str.isEmpty())
		{
			System.out.println("Invalid Input");
			return;

		}

		LinkedHashMap <Character,Integer> map=new LinkedHashMap<>();

		char firstNonReapeting=null;
		char firstReapeting=null;
		int max=0;


		for(char c:str.toCharArray()){
			map.put(ch,map.getOrDefault(ch,0)+1);
		}


		//firstNonReapeting Character

		for(char c : map.keySet()){
		{
			if(map.get(c) == 1){
				
				firstNonReapeting=c;
				break;
			}

		}





		//firstReapeting Character

		for(char c : map.keySet()){
		{


		int count=map.get(c);
			if(count>max){
				max=count;
				firstReapeting=c;
				
			}

		}

		if(firstNonReapeting!=null)
		System.out.println("First Non-Reapeating Charcter:"+" "+firstNonReapeting);


		if(firstReapeting!=null)
		System.out.println("First Non-Reapeating Charcter:"+" "+firstReapeting);



	}





	public static void main(String [] args){



	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the String :");

	String p=sc.nextLine();


	Calculate(p);






	}











}