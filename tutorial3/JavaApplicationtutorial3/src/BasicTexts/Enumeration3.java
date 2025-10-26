package BasicTexts;

public enum Enumeration3 {
    KALHARA("Software Engeneyer"),
    PASAN ("Students"),
    AVISHKA("Brother");
    
    public final String DESC;
    
    Enumeration3(String description){
        DESC =  description;
        
    }
    public String getDesc(){
        return DESC;
    }
    
}
