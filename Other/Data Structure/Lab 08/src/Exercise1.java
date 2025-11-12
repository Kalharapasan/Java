*import java.util.Scanner;
public class Exercise1 {
    static Scanner scn = new Scanner(System.in);

    public static void main(String args[]) {
        int arr[] = {10, 25, 5, 85, 60};
        for(int i=0;i< arr.length;i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        deleteVal(arr);
        display(arr);
        search(arr);
    }

    public static void display ( int arr[]){
        System.out.println("After Delete the Element");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

        public static void delete ( int[] arr){
            System.out.println("Enter the delete Index:");
            int index = scn.nextInt();

            if (index >= 0 && index < arr.length) {
                for (int i = index; i < arr.length - 1; i++) { // data movement
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }

        public static void deleteVal ( int arr[]){
            System.out.println("\nEnter the Value");
            int val = scn.nextInt();
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == val) {
                    index = i;
                }
            }
            delete(arr);
        }
        public static void search ( int arr[]){
            System.out.println("\nEnter the value which is going to be searched");
            int value = scn.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    System.out.println("The value is found at index: " +i);
                    break;
                } if(i == arr.length-1){
                    System.out.println("The value is not found");
                }
            }
        }
    }

