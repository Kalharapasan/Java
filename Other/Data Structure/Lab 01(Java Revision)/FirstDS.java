import java.util.Scanner; 
class FirstDS {
	public static void main(String args[]) {  // method signature
		Scanner mark = new Scanner(System.in);
		System.out.println("Enter Your First Number:");
		int x=  mark.nextInt();
		System.out.println("Enter Your First Number:");
		int y = mark.nextInt();
		
		int result = x+y;
		System.out.println("The Result is:" +result);  //javac : excutable file created(name.class)
	}
}