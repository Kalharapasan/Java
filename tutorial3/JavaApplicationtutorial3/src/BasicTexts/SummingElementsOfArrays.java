package BasicTexts;

public class SummingElementsOfArrays {
   
    public static void main(String[] args) {
        
        int num []={15,254,78,58,65,48,25};
        
        int sum=0;
        for(int count=0;count<num.length;count++){
            
            sum +=num[count];
        }
        System.out.println("Arrays sum is:-"+sum);
    }
    
}
