interface Tax{
 double TaxA=0.1;
 double TaxB=0.05;

 abstract void dispaly();

}

class Products implements Tax{
    String prid;
    int qty;
    double price;
    double tax;
    double totalcost;

    Products(String prId,int Qty){

     prid =prId;
     qty =Qty;
    }

    void calculation(){

     if (qty >1000){

      tax= qty*TaxA;

      totalcost= tax+qty;

      price = totalcost +(totalcost*0.1);

     }

     if(qty<=1000){

        tax=qty*TaxB;

       totalcost= tax +qty;
       price = totalcost +(totalcost*0.1);
     }
    }

    public void dispaly (){

     System.out.println("Products ID:- "+prid);
     System.out.println("Products Qtyiles:- "+qty);
     System.out.println("Products Tax:- "+tax);
     System.out.println("Products Totalcost:- "+totalcost);
     System.out.println("Products Price :- "+price);
    }

}

public class Main {

 public static void main(String[] args) {
   Products pro =new Products("P001", 1000);
   pro.calculation();
   pro.dispaly();
 }
 
}
