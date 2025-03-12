import java.util.Scanner;


//3 digit armstrong Number
public class ArmStrongNumber{


static boolean IsArmStrong( int n){

int original=n;
int sum=0;

while(n>0){

int digit=n%10;

sum+=digit*digit*digit;

n=n/10;


}


return sum == original;

}


public static void main(String [] args){


Scanner sc=new Scanner(System.in);

int n=sc.nextInt();


if(IsArmStrong(n)){

System.out.println("It is a armstrong Number");


}

else{

System.out.println("It is not a armstrong Number");
}






}











}