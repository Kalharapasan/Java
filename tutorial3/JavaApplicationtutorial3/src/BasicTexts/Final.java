package BasicTexts;

public class Final {
    private  int num ;
    private final int NUMBER;
    
    Final(int x){
        NUMBER =x;
        
    }
    public void add(){
        
        num = NUMBER +10;
        
        
    }
    public String getString(){
        return String.format("Anser Is = %s",num);
    }
    
     public static void main(String[] args) {
        Final FINAL =new Final(100);
        FINAL.add();
        System.out.println(FINAL.getString());
    }
  
}
