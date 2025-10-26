class DArraystestC{


	public static void main(String[] args) {
		
		int[][] myarrayA={{10,20,30,40,45},{6,7,8,9,1},{10,20,30,40,45},{6,7,8,9,1}};
		int[][] myarrayB={{10,20,30,40,45},{6,7,8,9,1},{10,20,30,40,45},{6,7,8,9,1}};
		int[][] sumarray=new int[4][5];
		System.out.println("myarrayA");
		for (int i=0;i<4;i++) {
			for (int j=0;j<5;j++) {//arrayA to print
				
				System.out.print(myarrayA[i][j]+"  ");
				
			}
			System.out.println();
			
		}

		System.out.println("myarrayB");

		for (int i=0;i<myarrayA.length;i++) {//arrayB to print
			for (int j=0;j<myarrayA[0].length;j++) {

				System.out.print(myarrayB[i][j]+"  ");
				
			}
			System.out.println();
		}

		for (int i=0;i<sumarray.length;i++) {
			for (int j=0;j<sumarray[0].length;j++) {
				
				sumarray [i][j]=myarrayA[i][j]+myarrayB[i][j];
					
				
			}

			
		}
		System.out.println("sumarray");

		for (int i=0;i<sumarray.length;i++) {
			for (int j=0;j<sumarray[0].length;j++) {
				
					System.out.print(sumarray[i][j]+"  ");
				
			}

			System.out.println();
		}


	}
}