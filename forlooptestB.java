class forlooptestB{

	public static void main(String[] args) {
		a java=new a();
		java.pasan();
		
	}
}

class a{
	
	public void pasan(){
	for (int i=0;i<10 ;i++ ) {
			
			for (int j=10;j>i ;j--) {
				
				System.out.print(" ");
			}
			for (int j=0;j<=i ;j++) {
				
				System.out.print("* ");
			}

			System.out.println("");
		}
		for (int i=0;i<10 ;i++ ) {
			
			for (int j=0;j<=i ;j++) {
				
				System.out.print(" ");
			}
			for (int j=10;j>i ;j--) {
				
				System.out.print("* ");
			}

			System.out.println("");
		}
	
	}
	
}