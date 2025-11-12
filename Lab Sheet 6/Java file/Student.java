public class Student{

	int id;
	String name;

	void insertStudentRecord(int Sid,String Sname){

		id =Sid;
		name=Sname;


	} 
	void displayStudentDetails(){
		System.out.println("ID :"+id);
		System.out.println("Name : "+name);
	}

}


class TestStudent{


	public static void main (String []args){

		Student S2 =new Student();

		S2.insertStudentRecord(1," Kamal");
		S2.displayStudentDetails();

		


	}

}