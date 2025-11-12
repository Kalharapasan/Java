import java.util.Scanner;
public class Array {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int arr[] = {10, 25, 5, 85, 60};
        insertB(arr);
        delete(arr);
        display(arr);
    }

    public static void insertB(int arr[]) {
        System.out.println("Enter Your Value");
        int val = scn.nextInt();

        System.out.println("Enter Your Index");
        int index = scn.nextInt();

        if (index > 0 && index < arr.length) {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
        }
        arr[index] = val;
        System.out.println("After Insert the Element");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void display(int arr[]) {
        System.out.println("After Delete the Element");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void delete(int[] arr) {
        System.out.println("\nEnter the delete Index:");
        int index = scn.nextInt();

        if (index >=0 && index < arr.length) {
            for (int i = index; i < arr.length-1; i++) { // data movement
                arr[i] = arr[i + 1];
            }
            arr[arr.length-1] =0;
        }
    }
}
