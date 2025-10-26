package BasicTexts;
import java.io.*;
public class WritingFiles {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("E:\\Software_Project\\JAVA\\BASICS\\tutorial3\\JavaApplicationtutorial3\\java\\javatext2.txt");
            fw.write("My name is Pasan Sawmya Kalhra");
            fw.close();
            System.out.println("File Writer");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
