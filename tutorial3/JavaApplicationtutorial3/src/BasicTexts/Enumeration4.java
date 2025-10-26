package BasicTexts;

public class Enumeration4 {
    public static void main(String[] args) {
        
        for(Enumeration3 obj:Enumeration3.values()){
            System.out.printf("%s\t%s\n",obj,obj.getDesc());
        }
    }
    
}
