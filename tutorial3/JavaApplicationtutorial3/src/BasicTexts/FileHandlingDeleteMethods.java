
package BasicTexts;

import java.io.File;
import java.io.FileWriter;

public class FileHandlingDeleteMethods {
    
     public static void main(String[] args) {
        
        File file =new File("E:\\Software_Project\\JAVA\\BASICS\\tutorial3\\JavaApplicationtutorial3\\java\\javatext.txt");
        try {
            if (file.delete()){
                System.out.println("File delete ");
            }
            else{
                System.out.println("File not exists");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
