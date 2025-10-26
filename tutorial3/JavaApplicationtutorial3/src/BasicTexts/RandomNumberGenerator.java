package BasicTexts;
import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        
        
        Random obj=new Random();
        int num ;
        for (int i = 0; i < 10; i++) {
            
            num=obj.nextInt(10);
            System.out.println(num);
        }
        
    }
    
}
