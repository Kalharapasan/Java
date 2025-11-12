import java.util.Scanner;

public class ICT{
    
    String regno ;
    String indexno ;
}


class Students{ 
	
	String regno ;
    String indexno ;
	ICT student =new ICT(); 

	void insertStudentRecord(){
			 
		Scanner myObj = new Scanner(System.in);
			
		System.out.print("Enter Student REG.Number:-");
		regno = myObj.nextLine();
			
		System.out.print("Enter Student indexno:-");
		indexno = myObj.nextLine();
			
		student.regno = regno;
		student.indexno =indexno;
		}		
	void displayStudentDetails(){
			
		System.out.println("Student REG.Number:-"+student.regno);
		System.out.println("Students Index No:"+student.indexno);
		}
		
		
    public static void main (String []args){
		
		Students mich = new Students();
		
		mich.insertStudentRecord();
		
		System.out.println("");
		System.out.println("");
        
		mich.displayStudentDetails();
		
    }
}

