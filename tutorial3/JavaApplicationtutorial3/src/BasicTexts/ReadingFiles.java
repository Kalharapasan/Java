
package BasicTexts;

import java.io.*;
import java.util.*;

public class ReadingFiles {
    public static void main(String[] args) {
        try {
            File fr=new File("E:\\Software_Project\\JAVA\\BASICS\\tutorial3\\JavaApplicationtutorial3\\java\\javatext2.txt");
            Scanner scn =new Scanner(fr);
            while(scn.hasNextLine()){
                String a = scn.nextLine();
                System.out.println(a);
            }
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
