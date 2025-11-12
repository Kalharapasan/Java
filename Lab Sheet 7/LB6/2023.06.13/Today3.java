public class Today3{

    int SID;
    String SName;
    int Age;
    void displayStudentDetalse(){
        System.out.println("Student Id :" +SID);
        System.out.println("Student Name  :" +SName);
        System.out.println("Student Age :" +Age);
    }
    public static void main(String []args){

        Today3 S1 =new Today3();

        S1.SID= 002;
        S1.SName ="Kalhra";
        S1.Age =22;

        S1.displayStudentDetalse();
    }
}