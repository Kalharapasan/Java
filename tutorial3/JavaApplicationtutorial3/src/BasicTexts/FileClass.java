package BasicTexts;
import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        File file =new File("E:\\Software_Project\\JAVA\\BASICS\\tutorial3\\JavaApplicationtutorial3\\src\\BasicTexts\\java.txt");
        if (file.exists()){
            System.out.println(file.getName()+" File exists");
        }
        else{
            System.out.println("File down not exists");
        }
        
    }
    
}
