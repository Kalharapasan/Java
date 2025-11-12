import java.util.Scanner;
public class RepalceArray {
    //public static void main(String[] args) {
        static Scanner scn = new Scanner(System.in);
        public static void insert(int[] arrA) {
        //int[] arrA = new int [10];

        System.out.println("Enter Your Value to be inserted");
        int val = scn.nextInt();

        System.out.println("Enter Your index to be inserted at");
        int index = scn.nextInt();

        if(index < arrA.length && index >0) {
            for (int i = arrA.length - 1; i >index; i--) { // replace and move
                arrA[i] = arrA[i-1];
            }
            arrA[index] = val;
            for (int j = 0; j<arrA.length; j++) {
                System.out.println(arrA[j]);
            }
        }
    }
}
