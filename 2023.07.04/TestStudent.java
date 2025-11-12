class Student{
    int stno;
    String name;

    Student(int Stno, String Name){
        this.stno =Stno;
        this.name=Name;

    }
    void display(){
        System.out.println("Student Number is : "+stno);
        System.out.println("Student Name is: "+name);
    }
}

class ITStudent extends Student{

    float Total,Average,marks1,marks2;

    ITStudent(int  Stno, String Name,float Marks1,float Marks2){
        super(Stno,Name);
        this.marks1 =Marks1;
        this.marks2 = Marks2;

    }

void Calculation(){
    Total = marks1 +marks2;
    Average =Total/3;
}


void display(){
        super.display();
        System.out.println("Student Marke1 is : "+marks1);
        System.out.println("Student  Marke2 is: "+marks2);
        System.out.println("Student Marke Total is : "+Total);
        System.out.println("Student  Marke Average is: "+Average);

    }
}

class TestStudent{
    public static  void main(String []args){
        ITStudent obj1 = new ITStudent(1001,"Kalhara",90,80);
        obj1.Calculation();
        obj1.display();

    }
}