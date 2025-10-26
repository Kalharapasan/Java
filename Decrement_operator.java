class Decrement_operator{

	public static void main(String[] args) {

		Decrement_operator ob =new Decrement_operator();
		ob.preDecrement();
		ob.postDecrement();
	
	}
		
	public void preDecrement(){

		System.out.println("Ages is 125");

		int ages = 125;

		System.out.println("preDecrement out:-"+ --ages);

	}	

	public void postDecrement(){
		int ages = 125;

		System.out.println("postDecrement out Frist:-"+ages--);
		System.out.println("postDecrement out Second:-"+ages);


	}
}