public class Exercise {
    public static void main(String[] args) {
        String s = "count";
        String y = "Count";

        if(s.equalsIgnoreCase(y)) {  //not see case sensitive just see same word or not. is this in show yes.
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
