class Ex03II{
    static void Display(int Index_No,String Name){
        System.out.println("Index Number Is : "+Index_No);
        System.out.println("Name Is : "+Name);
    }
    static void Display(String Index_No,String Name){
        System.out.println("Index Number Is : "+Index_No);
        System.out.println("Name Is : "+Name);
    }
    public static void main(String []args){
        
        
        System.out.println("--------------------Frist Methods--------------");
        Display(1001,"Kalhara");
        System.out.println("");
        System.out.println("");

        System.out.println("---------------------Second Methods------------------");
        Display("1001","Kalhara");
       

       
    }
}