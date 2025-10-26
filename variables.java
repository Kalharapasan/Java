class  VariablesTest{

	int values ;//nun static  variables
	static int max;//static  variables

	 public static void main(String[] args) {

	 	VariablesTest ob=new VariablesTest();
		ob.print();	
		ob.prints();
		ob.java();
		
	}

	public static void java(){

		System.out.println("static  variables:-"+max);


	}

	public void prints(){

		System.out.println("nun static  variables:-"+values);
		System.out.println("static  variables:-"+max);


	}

	public void print(){

		int value =10;//local variables
		System.out.println("local variables:-"+value);
		System.out.println("static  variables:-"+max);
	}

}

class a{


}