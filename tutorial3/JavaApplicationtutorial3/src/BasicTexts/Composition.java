package BasicTexts;

public class Composition {
    
    private  String name;
    private  ToString brithday;
    
    public Composition(String thename,ToString thedate){
        name=thename;
        brithday = thedate;
    }
    public String toString (){
        return String.format("My name is %s and my birthday is %s",name,brithday);
    }
    
    
    public static void main(String[] args) {
        ToString obj = new ToString(2001,01,20);
        Composition obj2 =new Composition("Klahara",obj);
        System.out.println(obj2);
        
        
        
        
    }
}
