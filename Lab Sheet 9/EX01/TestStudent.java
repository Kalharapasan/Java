class Student {
  String stno;
  String name;

  Student(String Stno,String Sname){
      this.stno =Stno;
      this.name =Sname;
  }

  void display(){
   System.out.println("Student Index  Number is:- "+stno);
   System.out.println("Student Name is:- "+name);
  }

}

class ITStudent extends Student{

 double marks1;
 double marks2;
 double Total;
 double Average;

 ITStudent(String Stno,String Sname,double Marks1,double Marks2){
  super(Stno,Sname);
  this.marks1 =Marks1;
  this.marks2 =Marks2;

 }

 void Calculation(){
  Total =marks1+marks2;
  Average =Total/2;

 }
 void display(){
  super.display();
   System.out.println("Student Marks1 is:- "+marks1);
   System.out.println("Student Marks2 is:- "+marks2);
   System.out.println("Student Marks total is:- "+Total);
   System.out.println("Student Marks average:- "+Average);
  }


}

class TestStudent{
 public static void main(String []args){
  ITStudent obj1=new ITStudent("S001","Kalhara",90,94);
  obj1.Calculation();
  obj1.display();
 }
}