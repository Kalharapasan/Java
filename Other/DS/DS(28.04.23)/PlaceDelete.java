import java.util.Scanner;

public class PlaceDelete{
 
   public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);    
    int [] array = {2,5,6,7,9,1,3};
    
    for(int x : array){

        System.out.println(x);
    }

    System.out.println("Enter the Index:");

    int index = sc.nextInt();

    for(int i=index; i<array.length-1; i++){
        array[i] = array[i+1];
    }

    array[array.length-1]=0;
    for(int x=0; x<array.length; x++){
        System.out.println(array[x]+" ");
    }
    }
    
}