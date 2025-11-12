import java.util.Scanner;
public class SearchArray {
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
    }
}

