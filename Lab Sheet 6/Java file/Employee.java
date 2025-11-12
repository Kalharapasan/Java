public class Employee{

	String empid; 
	String name; 
	float salary ;

	void insert(String Sempid,String Sname,float Ssalary ){

		empid =Sempid;
		name =Sname;
		salary =Ssalary;

	} 

	void display(){

		System.out.println("EmpID: :"+empid);
		System.out.println("Name : "+name);
		System.out.println("sSlary :"+salary);
	}

}

class TestEmployee{

	public static void main(String[] args) {

		Employee emp1 =new Employee();
		Employee emp2 =new Employee();
		Employee emp3 =new Employee();


		emp1.insert("EMP001","Saman",10000);
		emp1.display();
		emp2.insert("EMP002","Kumara",20000);
		emp2.display();
		emp3.insert("EMP003","Kalhara",50000);
		emp3.display();
		
		
	}
}