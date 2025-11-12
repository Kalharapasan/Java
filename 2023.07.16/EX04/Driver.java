interface SBC{

    abstract  void  Before_Balanece(int BBalanece);
    abstract void  After_Balanece(int ABalanece);
    abstract void  widrow(int WBalanece);
    abstract void Current_Balanece();
}

class People implements SBC{

    int Balanece;
    public void  Before_Balanece(int BBalanece){
        Balanece =BBalanece ;
    }
    public void  After_Balanece(int ABalanece){
        Balanece =ABalanece + Balanece;
        System.out.println("After Diposit Balanece is :-"+Balanece);

    }
    public void  widrow(int WBalanece){
        Balanece=Balanece-WBalanece;
        System.out.println("After widrow Balanece is :-"+Balanece);


    }
    public void Current_Balanece(){
        System.out.println("Current Balanece is :-"+Balanece);
    }

}

public class Driver {

    public static void main(String []args){
        People transetion =new People();

        transetion.Before_Balanece(30000);
        transetion.Current_Balanece();
    
        transetion.After_Balanece(20000);
    
        transetion.widrow(25000);

        transetion.Current_Balanece();


    }
    
}