import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<>();

        h.put("Swastik", 99);
        h.put("Ram", 94);
        h.put("Shyam", 56);

        System.out.println(h);
        System.out.println("Size is:" + h.size());

        for (Map.Entry<String, Integer> e : h.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
