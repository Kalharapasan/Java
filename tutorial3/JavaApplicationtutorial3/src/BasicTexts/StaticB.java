
package BasicTexts;

public class StaticB {
    private String fname;
    private String lname;
    private static int member =0;
    
    StaticB(String fn,String ln){
        fname= fn;
        lname =ln;
        member ++;
        System.out.printf("%s %s member in the library:%d \n",fname,lname,member);
    }
}
