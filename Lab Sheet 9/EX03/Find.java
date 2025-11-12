class  Maximum{
 
 void findMax(int num1,int num2){
  int Maximum_num;
    if (num1 >0 ){
      if(num2 >=num1){
        Maximum_num =num2;
      }
      else {
       Maximum_num =num1;
      }
    }
    else{
     if (num2 <=num1){
      Maximum_num =num2;
     }
     else {
       Maximum_num =num2;
      }
    }
    System.out.println(Maximum_num);
 }

 void findMax(float num1,float num2){
  float Maximum_num;
   if (num1 >0 ){
      if(num2 >=num1){
        Maximum_num =num2;
      }
      else {
       Maximum_num =num1;
      }
    }
    else{
     if (num2 <=num1){
      Maximum_num =num2;
     }
     else {
       Maximum_num =num2;
      }
    }

    System.out.println(Maximum_num);
 }

void findMax(  double num1,  double num2){
    double Maximum_num;
   if (num1 >0 ){
      if(num2 >=num1){
        Maximum_num =num2;
      }
      else {
       Maximum_num =num1;
      }
    }
    else{
     if (num2 <=num1){
      Maximum_num =num2;
     }
     else {
       Maximum_num =num2;
      }
    }

    System.out.println(Maximum_num);
 }

}


class Find extends  Maximum{
  public static void main(String[] args) {
    Find obj1 = new Find();
    obj1.findMax(20, 50);
    obj1.findMax(40.5f, 56.2f);
    obj1.findMax(75.555, 89.445);
    
  }
 
}
