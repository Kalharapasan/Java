interface SBC{

    abstract  void  before_Balanece();
    abstract  void  diposit();
    abstract void  after_Balanece();
    abstract void  widrow();
    abstract void Current_Balanece();

}

class People implements SBC{
    int bBalanece =30000;
    int depo =20000;
    int aBalanece = bBalanece+depo;
    int wid =25000;
    int cBalanece =aBalanece-wid;

    public void before_Balanece(){
        System.out.println("Before Balanece is :-"+bBalanece);

    }
    void  diposit(){
        System.out.println(" Diposit Amount is :-"+depo);
    }
    void  after_Balanece(){
        System.out.println("After Diposit Balanece is :-"+aBalanece);
    }
    void  widrow(){
         System.out.println("widrow amount is :-"+wid);
    }
    void Current_Balanece(){
        System.out.println("After add widrow amount  is :-"+cBalanece)
    }



}

public class Saving{
    
}