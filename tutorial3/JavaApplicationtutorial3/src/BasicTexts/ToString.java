package BasicTexts;

public class ToString {
     private int Year;
     private int month;
     private int daya;
     
     public ToString(int y,int m ,int d){
         Year=y;
         month=m;
         daya=d;
         
         System.out.printf("My Brithday is %s\n ",this);
    
    }
     public String toString(){
         return String.format("%d/%d/%d", Year,month,daya);
     }
     
     public void Dispaly(){
         System.out.printf(" Brithday is %s\n ",this);
     }
    
    
    
    
    public static void main(String[] args) {
        ToString obj = new ToString(2001,01,20);
        
        obj.Dispaly();
        
        
    }
}