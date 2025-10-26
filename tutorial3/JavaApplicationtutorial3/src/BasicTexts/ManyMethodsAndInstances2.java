
package BasicTexts;


public class ManyMethodsAndInstances2 {
    private String FriendName;
    public void getName(String name){
        FriendName = name;
    }
     public String setName(){
         return FriendName;
         
     }
     public void say(){
         System.out.println("You friend name is "+setName());
     }
}
