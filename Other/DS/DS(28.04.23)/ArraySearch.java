import java.util.Scanner;

public class ArraySearch{
    static int key;
   public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);    
    int [] array = {2,5,6,7,9,1,3};
    
    for(int x : array){
    
    System.out.println("");
    System.out.println("Enter the Index: ");

    int value = sc.nextInt();

    for(int i=0; i<array.length; i++){
       if(array[i] == value){
        key=1;
        break;

       }else
       {
        key=0;
       }
    }

    if(key == 1){
        System.out.println("It is in array");
    }else{
        System.out.println("Don't have the value");
    }
    
    }
    
}
}