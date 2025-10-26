package BasicTexts;
enum day{
    SUNDAY,MONDAY,TUSEDAY,WEDNESDAY
}
public class Enumeration2 {
    public static void main(String[] args) {
        day dd =day. MONDAY;
        switch (dd){
            case SUNDAY:
                System.out.println("SUNDAY");
                break;
            case MONDAY:
                System.out.println("MONDAY");
                break;
            case TUSEDAY:
                System.out.println("TUSEDAY");
                break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY");
                break;
        }
    }
    
}
