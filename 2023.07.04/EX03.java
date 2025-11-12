 class EX03{

    static void Display (String Index_No,String Name){
        System.out.println("Index Number Is : "+Index_No);
        System.out.println("Name Is : "+Name);

    }
    static void Display (String Index_No,String Name,int Age){
        System.out.println("Index Number Is : "+Index_No);
        System.out.println("Name Is : "+Name);
        System.out.println("Age Is : "+Age);

    }
    static  void Display (String Index_No,String Name,int Age,int Marks1,int Marks2,int Marks3){
        System.out.println("Index Number Is : "+Index_No);
        System.out.println("Name Is : " +Name);
        System.out.println("Age Is : " + Age);
        System.out.println("Marks1 Is : " + Marks1);
        System.out.println("Marks2 Is : " + Marks2);
        System.out.println("Marks3 Is : " + Marks3);

    }

    public static void main(String []args){
        
        
        System.out.println("--------------------Frist Methods--------------");
        Display("S1001","Kalhara");
        System.out.println("");
        System.out.println("");

        System.out.println("---------------------Second Methods------------------");
        Display("S1001","Kalhara",22);
        System.out.println("");
        System.out.println("");

        System.out.println("-----------------Therd Methods-------------------");
        Display("S1001","Kalhara",22,89,80,75);
    }


 }