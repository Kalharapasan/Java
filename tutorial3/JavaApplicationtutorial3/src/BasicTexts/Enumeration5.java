
package BasicTexts;

public enum Enumeration5 {
    KALHARA("Software Engeneyer",21),
    PASAN ("Students",21),
    AVISHKA("Brother",12);
    
    public final String DESC;
    public final int AGE;
    
    
    Enumeration5(String description,int year ){
        DESC =  description;
        AGE=year;
        
    }
    public String getDesc(){
        return DESC;
    }
     public int getAge(){
        return AGE;
    }
    
    
}
