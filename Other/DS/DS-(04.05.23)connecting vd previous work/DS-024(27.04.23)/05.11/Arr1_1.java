import java.util.Scanner;

public class Arr1_1{
    static Scanner scn = new Scanner(System.in);
    public static void main(String [] args){
        
        int[] arr= {10,25,5,85,60};
        search(arr);
    }
    
        
    public static void search(int arr[]){
        System.out.println("Enter value which is going to be search : ");
        int value = scn.nextInt();

        for(int i=0;i<arr.length;i++){
                if(arr[i] == value){
                  System.out.println("The value is found at index : "+i);  
                  break;
                }
            if(i == arr.length-1){
                System.out.println("The value is not found ");
            }
            }
    }
    
    
}