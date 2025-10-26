
package BasicTexts;
import java.io.*;
public class CreatingFiles {
    public static void main(String[] args) {
        File folder =new File("E:\\Software_Project\\JAVA\\BASICS\\tutorial3\\JavaApplicationtutorial3\\java");
         try {
            if (folder.mkdir()){
                System.out.println("Folder creat !"+folder.getName());
            }
            else{
                System.out.println("Folder exists");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        File file =new File("E:\\Software_Project\\JAVA\\BASICS\\tutorial3\\JavaApplicationtutorial3\\java\\javatext.txt");
        try {
            if (file.createNewFile()){
                System.out.println("File creat !"+file.getName());
            }
            else{
                System.out.println("File exists");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
         
    }
}
