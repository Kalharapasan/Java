package BasicTexts;

public class BuildingObjectsForConstructors2 {
    public static void main(String[] args) {
         BuildingObjectsForConstructors obj = new BuildingObjectsForConstructors();
         System.out.printf("%s\n",obj.Display());
         
         BuildingObjectsForConstructors obj2 = new BuildingObjectsForConstructors(4);
         System.out.printf("%s\n",obj2.Display());
         
         BuildingObjectsForConstructors obj3 = new BuildingObjectsForConstructors(4,24);
         System.out.printf("%s\n",obj3.Display());
         
         BuildingObjectsForConstructors obj4 = new BuildingObjectsForConstructors(4,24,15);
         System.out.printf("%s\n",obj4.Display());
       
         
    }
}
