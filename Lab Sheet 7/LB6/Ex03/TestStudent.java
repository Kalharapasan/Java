import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {

        String Name;
        String Number;
        int [] marks =new int[3] ;
        
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter Student Name:-");
        Name = scanner.nextLine();
        System.out.print("Enter Student Number:-");
        Number = scanner.nextLine();
       
        for(int i=0;i<3;i++){
            
            System.out.print("Enter Student Suject "+(i+1)+" Marks:-");
            marks[i] =scanner.nextInt();
        }
        
        //int [] marks ={85 ,55 ,45};
  
        Student S1 = new Student(Number, Name,marks);

        System.out.println("");

        S1.calculateTotal();
        S1.calculateAverage();
        S1.calculateGrade();
        S1.Display();

    }

}
