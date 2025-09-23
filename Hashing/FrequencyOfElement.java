import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int arr[] = {10,10,20,30,40,40,40,50};
        HashMap<Integer , Integer> h = new HashMap<>();

        for(int x : arr){
            h.put(x, h.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer, Integer> e : h.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
