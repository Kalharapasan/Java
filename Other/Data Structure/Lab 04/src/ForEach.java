import java.util.HashSet;
import java.util.Set;

public class ForEach {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("Fathi");
        s.add("Asra");
        s.add("Shafra");
        s.add("Shafa");

        for(String d : s) {
            System.out.println(d);
        }
    }
}
