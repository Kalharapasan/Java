import java.util.Scanner;
public class DeleteArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr ={2,5,7,8,4,6,9};

        for (int x: arr) {
            System.out.print(x+" ");
        }

        System.out.println(" ");

        System.out.println("Enter Your index, to be deleted");
        int index = scn.nextInt();

        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }

        //after
        arr[arr.length-1] =0;
        for (int x = 0; x <arr.length; x++) {
                System.out.print(arr[x]+" ");
            }
        }
    }

