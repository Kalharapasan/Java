class DArraystest{

	public static void main(String[] args) {
		int[][] myarray=new int[2][2];
		myarray[0][0]=12;
		myarray[0][1]=13;
		myarray[1][0]=15;
		myarray[1][1]=45;
		

		for (int i=0;i<2;i++) {
			

			for (int j=0;j<2;j++) {
				
				System.out.println(myarray[i][j]);
				
			}
			
		}
	}
}