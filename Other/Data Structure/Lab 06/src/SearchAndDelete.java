import java.util.Scanner;
public class SearchAndDelete {
    static int key;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr ={2,5,7,8,4,6,9};
        int i=0;
        for (int x: arr) {
            System.out.print(x+" ");
        }

        System.out.println(" ");

        System.out.println("Enter the Value");
        int value = scn.nextInt();

        //search looping
        for (; i < arr.length; i++) {
            if (arr[i] == value) {
                key = 1;
                break;
            } else {
                key = 0;
            }
        }

        if(key == 1) {
            System.out.print("It is located in "+i+"th place");
        }else {
            System.out.print("Don't have the value ");
        }

        System.out.println("\nEnter Your index, to be deleted");
        int index = scn.nextInt();

        for (int j = index; j < arr.length-1; j++) {
            arr[j] = arr[j+1];
        }

        //after
        arr[arr.length-1] =0;
        for (int x = 0; x <arr.length; x++) {
            System.out.print(arr[x]+" ");
        }
    }

}
