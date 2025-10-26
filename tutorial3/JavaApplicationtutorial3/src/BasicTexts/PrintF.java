package BasicTexts;

import java.util.Locale;

public class PrintF {
    public static void main(String[] args) {
        
        //%s = String
        //%d = integre
        //%.2= flot
        
        System.out.printf("My name is %s and my age is %d and Pi eqaly %.2f"," kalhara",25,45.25);      
        System.out.println("");
        System.out.printf("My name is %s and my age is %04d and Pi eqaly %.1f"," kalhara",25,45.25);
        System.out.println("");
        System.out.printf("My name is %s and my age is %05d and Pi eqaly %.15f"," kalhara",25,45.25);
    }
    
}
