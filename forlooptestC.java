class forlooptestC{

	public static void main(String[] args) {
		for (int i=0;i<20 ;i+=2 ) {
			
			for (int j=20;j>i ;j--) {
				
				System.out.print(" ");
			}
			for (int j=0;j<=i ;j++) {
				
				System.out.print("* ");
			}

			System.out.println("");
		}
	}
}