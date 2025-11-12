class Calculator{
    void add(int a,int b){
        System.out.println("Answer is: "+(a+b));
    }
    void sub(int a,int b){
        System.out.println("Answer is: "+(a-b));
    }
}

class AdvancedCalculator extends Calculator{  
    void mul(int a,int b){
        System.out.println("Answer is: "+(a*b));

    }
    void div(int a,int b){
        System.out.println("Answer is: "+(a/b));
    }

    public static void main (String []args){
        int a=100;
        int b=5;

        AdvancedCalculator calculator = new AdvancedCalculator();

        calculator.add(a,b);
        calculator.sub(a,b);
        calculator.mul(a,b);
        calculator.div(a,b);
    }
}

