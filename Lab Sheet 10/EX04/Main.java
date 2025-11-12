abstract class Calculation {
 abstract void calculate(int num1,int num2);
}

class Addition extends Calculation{
  void calculate(int num1,int num2){
  int addition =num1+num2;
  System.out.println("Addition Value is :-"+addition);

 }
}

class Subtraction extends Calculation{
  void calculate(int num1,int num2){
  int subtraction =num1-num2;
  System.out.println("Subtraction Value is :- "+subtraction);
  
 }
 }

 class Multiplication extends Calculation{
  void calculate(int num1,int num2){
  int multiplication =num1*num2;
  System.out.println("Multiplication Value is :-"+multiplication);
  
 }

 }

class Division extends Calculation {
  void calculate(int num1,int num2){
  double division =num1/num2;
  System.out.println("Division Value is :-"+division);
  
 }

 }


class Main{
 public static void main(String[] args) {
   Addition add =new Addition();
   add.calculate(10,25);
   Subtraction subt =new Subtraction();
   subt.calculate(25,10);
   Multiplication mlt =new Multiplication();
   mlt.calculate(10,25);
   Division div = new Division();
   div.calculate(10,25); 
 }

}