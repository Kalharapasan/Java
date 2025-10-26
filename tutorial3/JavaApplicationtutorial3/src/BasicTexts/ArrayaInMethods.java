package BasicTexts;

public class ArrayaInMethods {
    
    public static void main(String[] args) {
        
        int num []={15,254,78,58,65,48,25};
        Arraya(num);
        for(int y:num)
            System.out.println(y);
        
        
    }
    public static void Arraya(int x[]){
        for (int i=0;i<x.length;i++)
            x[i]+=10;
    }
}
