public class Splitter2 {
    public static void main(String[] args) {
        String sent = "All Students are Brillient";
        //System.out.println(sent.length());
        for (String s : sent.split("" +" ")) {
            System.out.println(s);
        }
    }
}
