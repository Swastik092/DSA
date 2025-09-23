import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int a[] = {10,20,30,40};
        int b[] = {10,40,50};

        HashSet<Integer> h = new HashSet<>();

        for(int i=0;i<a.length;i++){
            h.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            h.add(b[i]);
        }
        System.out.println(h);
        System.out.println(h.size());
        
    }
}
