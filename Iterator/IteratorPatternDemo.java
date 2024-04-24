import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();

        names.add("AAA");
        names.add("BBB");
        names.add("CCC");
        names.add("DDD");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
