
package BasicTexts;

import java.io.File;
import java.io.FileWriter;

public class FileHandlingMethods {
    
     public static void main(String[] args) {
        
        File f =new File("E:\\Software_Project\\JAVA\\BASICS\\tutorial3\\JavaApplicationtutorial3\\java\\javatext2.txt");
        try {
            if (f.exists()){
                System.out.println(f.isHidden());
                System.out.println(f.getTotalSpace());
                System.out.println(f.getName());
                System.out.println(f.canRead());
                System.out.println(f.canWrite());
                System.out.println(f.getAbsolutePath());
                System.out.println(f.length());
               
            }
            else{
                System.out.println("File not exists");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
