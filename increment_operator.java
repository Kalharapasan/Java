class increment_operator{
	public static void main(String[] args) {

		increment_operator ob =new increment_operator();
		ob.preincrement();
		ob.postincrement();
	
	}
		
	public void preincrement(){

		System.out.println("Ages is 125");

		int ages = 125;

		System.out.println("preincrement out:-"+ ++ages);

	}	

	public void postincrement(){
		int ages = 125;

		System.out.println("postincrement out Frist:-"+ages++);
		System.out.println("postincrement out Second:-"+ages);


	}



}