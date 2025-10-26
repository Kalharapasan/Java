
package BasicTexts;


public class Nestedif {
      public static void main(String[] args) {
        
        int age = 15;
        
        if (age >=18){
            
            System.out.println("You Can log +18 web  ");
        }
        else{
             System.out.println("You Can't log +18 web");
             if (age > 14){
                 System.out.println("But you Can log +14 web");
             }
             else{
                 System.out.println("Sorry");
             }
        }
        
        
    }
    
}
