class Student{

    int Studen_No;
    String Name;

    public Student(int Sno,String SName){

        Studen_No=Sno;
        Name =SName;
    }

    void Display(){
        System.out.println("Student Number : "+Studen_No);
        System.out.println("Student Name : "+Name);

    }

}
 class ITStudent extends Student{
    float marks_1;
    float marks_2;
    float Total;
    float Average;
   
    public ITStudent(int StudentNumber, String Sname,float Smarks_1,float Smarks_2){
        super(StudentNumber,Sname);
        marks_1 =Smarks_1;
        marks_2=Smarks_2;
    }

    void calculation(){
        Total =marks_1+marks_2;
        Average =Total/2;        
    }

    void Display(){
        super.Display();
        System.out.println("Student Mark_01 : "+marks_1);
        System.out.println("Student Marks_1 : "+marks_2);
        System.out.println("Student Total : "+Total);
        System.out.println("Student AvAverage : "+Average);
    }
}

class TestStudent {

    public static void main(String[] args) {
        ITStudent obj1 =  new ITStudent(001,"Kalhara",75,85);
        obj1.calculation();
        obj1.Display();
        
        
    }

   
    
}
