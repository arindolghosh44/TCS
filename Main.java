import java.util.*;


class Main{



	public static void main (String [] args){


		Scanner sc=new Scanner(System.in);


		String str=sc.nextLine();



		if(str.startsWith("(") && str.endsWith(")")){


			//Remove the parenthesis
			str=str.substring(1,str.length()-1);

		String [] nums=str.split(",");

		
		
		List<Integer> list=new ArrayList<>();

		for(String num:nums){
			
			list.add(Integer.parseInt(num));
		}

		System.out.println("");

			for(int i:list)

				System.out.print(i+" ");


		}












	}



















}