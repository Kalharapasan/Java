class Maximum{
     int number1,number2,Max;
        void findMax(int number1,Iint number2){
            if(number1>number2){
                Max=number1;

            }
            else{
                Max=number2;

            }
            System.out.println("Maximum Number is:"+ Max);

        }
    public static void main(String[]args){
       Maximum obj = new Maximum();
       obj.findMax(10,20);
    }
}
