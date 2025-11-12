public class Student {
    int id ;
    String Name;
    Student s1 =new Student();
    static void insertStudentRecord( int sid,String sName){
        sid =s1.id;
       sName =s1.Name;
    }
     static void displayStudentDetails(){
        System.out.println("Students Id is "+s1.id);
        System.out.println("Students Name is "+s1.Name);

    }
    
}
 
