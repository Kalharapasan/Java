
package BasicTexts;

import java.util.EnumSet;


public class Enumeration5B {
    public static void main(String[] args) {
        for(Enumeration5 obj:Enumeration5.values()){
            System.out.printf("%s\t%s\t%d\n",obj,obj.getDesc(),obj.getAge());
        }
        System.out.println("");
        System.out.println("");
        
        for(Enumeration5 obj:EnumSet.range(Enumeration5.KALHARA,Enumeration5.PASAN)){
            System.out.printf("%s\t%s\t%d\n",obj,obj.getDesc(),obj.getAge());
        }
    }
    
}
