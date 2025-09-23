import java.util.HashSet;

public class DistinctElements {
    public static void main(String[] args) {
        int arr[] = {10,20,10,20,10,30,30,40};
        HashSet<Integer> h = new HashSet<>(); 

            for(int j=0;j<arr.length;j++){
                h.add(arr[j]);
        }
        System.out.println("Number of distinct elements:" + h.size());
        System.out.println("Elements:" + h);
    }
}
