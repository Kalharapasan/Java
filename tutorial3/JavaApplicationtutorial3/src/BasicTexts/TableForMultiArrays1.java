package BasicTexts;

public class TableForMultiArrays1 {
    
    public static void main(String[] args) {
        
        int num2[][]={{1,1,1},{2,2,2},{1,1,1},{2,2,2,2},{1,1,1,1},{2,2,2,1}};
        for (int row=0;row<num2.length;row++){
            for(int colum=0;colum<num2[row].length;colum++){
                System.out.print(num2[row][colum]+"\t");
                
            }
            System.out.println("");
        }
        
        
    }
}
