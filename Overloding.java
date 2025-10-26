class Overloding{

	public static void main(String[] args) {

		Ab ob = new Ab();
		ob.sum();
		System.out.println("Int Sum Method Called:- "+ob.sum(10));
		System.out.println("Double Sum Method Called:- "+ob.sum(12,25));
		
	}
}

class Ab{

	public void sum(){
		System.out.println("void Sum Method Called");

	}
	public int sum(int x){
		return x;

	}
	public double sum(int k,int y){
		int a = k+y;
		return a;
	}
}