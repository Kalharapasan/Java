import java.util.*;

public class ArrB{
    static Scanner scn = new Scanner(System.in);
    public static void insert (int[] arrN){
        
        
        System.out.println("Enter the value to be interested");
        int val = scn.nextInt();

        System.out.println("Enter the value to be interested at");
        int index = scn.nextInt();

        if(index<arrN.length && index>=0){
            for(int i= arrN.length-1; i>=index; i--)// FOR MOVING ELEMENTS
            {
                arrN[i] = arrN[i-1];

            }
            arrN[index] = val;
            for(int j=0; j<arrN.length; j++)//PTRINTING THE UPDATED ELEMENT
            {
                System.out.println(arrN[j]);
            }
        }

    }
}