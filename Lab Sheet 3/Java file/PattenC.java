public class PattenC{
	public static void main(String[] args){
		int x,y,alphabet =65;
		for(x=0;x<=9;x++){	
			for(y=0;y<=x;y++){
				System.out.print((char) alphabet+" ");
			}
		alphabet++;
		System.out.println();
		}
	}
}