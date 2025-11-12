public class PattenB{
	public static void main(String[] args){
		int x,y,num=1,c=7;
		for(x=0;x<c;x++){
			for(y=0;y<=x;y++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}	
}