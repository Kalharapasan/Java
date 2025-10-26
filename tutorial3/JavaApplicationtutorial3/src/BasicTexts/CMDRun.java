package BasicTexts;



public class CMDRun {
    
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("cmd /c Notepad");
        } catch (Exception e) {
            System.err.println(e);
           
        }
    }
}
