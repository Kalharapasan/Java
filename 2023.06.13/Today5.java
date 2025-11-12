public class Today5{
    int Id;
    String Name;
    public Today5(int SId,String SName){
        Id =SId ;
        Name =SName;
    }
    public static void main(String []args){

        Today5 S1 =new Today5(1,"Kalhara");
        System.out.println("Name is :"+S1.Name);
        System.out.println("ID IS : "+S1.Id);
        
    }
}