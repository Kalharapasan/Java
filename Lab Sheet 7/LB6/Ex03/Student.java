public class Student{

    String Number;
    String Namen; 
    int [] Marks;
    int Total =0;
    float Average; 
    String  Grade;

    public Student(String number,String Name, int[] marks){
        Number =number;
        Namen =Name;
        Marks =marks;
        
    } 


    public void calculateTotal(){

        for (int i=0;i<3;i++){

            Total = Total +Marks[i];
        }
        

    }

    public void calculateAverage() {
        Average =Total/3;

       
    }
    public void calculateGrade() {
        if(Average >=45){
            Grade ="Pass";
        }
        else{
            Grade ="Fail";
        }


    }

    public void Display(){
        System.out.println("Students Number:- " + Number);
        System.out.println("Students Name- " + Namen);

        for(int i=0;i<3;i++){
            System.out.println("Students Subjacet "+(i+1)+"Mark:-"+ Marks[i]);
        }
        
        System.out.println("Students Total Marks:- " + Total);
        System.out.println("Students Marks Average:- " + Average);
        System.out.println("Students Grade:- " + Grade);
    }

}