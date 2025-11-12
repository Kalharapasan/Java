public class Array{
    public static void main (String [] args){
        int[] arrN = new int[3];

        int[] arrM = {3,5,8};
        arrM[1] = 0;

        arrN[0] = 5;
        arrN[2] = 6;

        for(int i=0; i<arrM.length; i++)
        {
            System.out.println(arrM[i]);
        }

    }
}