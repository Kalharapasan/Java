
abstract class A{

	abstract void display_name();
	abstract void display_Age();
	abstract void display_School();
	void display_University(){
		System.out.println("South Estern University Of Sti Lanka");

	}

}
class B extends A{
	void display_name(){
		System.out.println("Name Kalhara");
	}
}
class C extends A{
	void display_Age(){
		System.out.println("Age 22");
	}
}
class D extends A{
	void display_School(){
		System.out.println("Am/Dihe/Madagama M.V");
	}
}

// class E extends D{

// 	void display_Grade(){
// 		super.display_School();;
// 		System.out.println("13 B");

// 	}
// }



public class Main{

	public static void main(String[] args) {

		System.out.println("Hello Java");

		B objB= new B();
		C objC= new C();
		D objD= new D();

		objB.display_name();
		objC.display_Age();
		objD.display_School();

		//objE.display_Grade();

		objC.display_University();
		//objD.display_University();
	


	 
	}
}