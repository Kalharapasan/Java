import java.util.Scanner;
public class Calculator{
	
	public static void main (String [] Args){
	 
	 Scanner sun = new Scanner (System.in);
	 double num1,num2,ans;
	 
	 System.out.print("Enter Number:-");
	 num1=sun.nextDouble();
	 
	  
	 System.out.print("Enter Number:-");
	 num2=sun.nextDouble();
	 
	 
	 ans = num1+num2;
	 System.out.println("Anser is:-"+ans);
	 
 }


}