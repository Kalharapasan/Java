import java.util.Scanner;

public class DeleteValue{
 
   public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);    
    int [] array = {10,25,5,85,60};
    
    for(int x : array){

        System.out.println(x);
    }

    System.out.println("Enter the Delete index value:");

    int index = sc.nextInt();

    for(int i=index; i<array.length-1; i++){
        array[i] = array[i+1];
    }

    array[array.length-1]=0;
    for(int x=0; x<array.length; x++){
        System.out.println(array[x]+" ");
    }

    // if(index >0 && index.arr.length){
    //     for(int i=index; arr.length-1; i++){
    //         arr[i]=arr[i+1];
    //     }
    //     arr[arr.length-1]=0;
    // }
    }
    
}