
package BasicTexts;


public class constructorsText2 {
    
    private String FriendName;
    
    public constructorsText2(String name){
         FriendName = name;
        
    }
//    public void getName(String name){
//        FriendName = name;
//    }
     public String setName(){
         return FriendName;
         
     }
     public void say(){
         System.out.println("You friend name is "+setName());
     }
    
}
