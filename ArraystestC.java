class ArraystestC{
	public static void main(String[] args) {
		int[] myarray ={100,150,200,250,300,350,400};
		ArraystestA(myarray);
	}

	public static void ArraystestA(int [] value){

		int sum=0;
		for (int i=0;i<7;i++) {
			sum=sum+value[i];
			
		}

		System.out.println(sum);

	}
}