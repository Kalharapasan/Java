public class Array {
    public static void main(String[] args) {
         int [] arrN = new int [3]; // size of array

        int [] arrM = {3,5,8};
        arrM[1] = 0; // replace the 1st index as 0

        arrN[0] = 5;
        arrN[2] = 6;

        //1st array element
        for(int i=0; i < arrN.length; i++) {
            System.out.println(arrN[i]);
        }
        //2nd array element
        for(int i=0; i < arrM.length; i++) {
            System.out.println(arrM[i]);
        }
    }
}
