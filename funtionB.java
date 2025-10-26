class funtionB{

	public static void main(String[] args) {
		int frist =sum(12,15);
		System.out.println("Frist Value is:-"+frist);

		A ob=new A();
		int num =ob.maximum(30,13);
		System.out.println("Maxsimau Value is:-"+num);
		
	}

	public static int sum(int fvalue,int svalue){
		int s=fvalue+svalue;
		return s;


	}
}

class A{

	public static int maximum(int x ,int y){

		int s=0;
		if(x>y){
			s=x;

		}
		else{
			s=y;
		}

		return s;

	}
}

