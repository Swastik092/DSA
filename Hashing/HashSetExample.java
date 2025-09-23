import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>(5);

        h.add("Swastik");
        h.add("Madhav");
        h.add("Kabra");

        System.out.println(h);
        System.out.println("Does the hashset contain Madhav:" + h.contains("Madhav"));

        h.remove("Kabra");
        System.out.println(h);
        System.out.println(h.size());

        for (String s : h) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(h.isEmpty());
    }
}
