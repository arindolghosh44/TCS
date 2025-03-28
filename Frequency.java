import java.util.*;

public class Frequency{



	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();


		while(t-- > 0){


			String st=sc.nextLine();

			
			Map<Character,Integer> map= new TreeMap<>();

			for(char ch:st.toCharArray()){

				map.put(ch,map.getOrDefault(ch,0)+1);

			}

			for(Map.Entry<Character,Integer> entry: map.entrySet()){


				System.out.println(entry.getKey()+" "+entry.getValue());



			}










		}













	}



















}