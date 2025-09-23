import java.util.HashSet;

public class DistinctElementsInWindow {
    public static void main(String[] args) {
        int arr[] =   {10,20,20,10,30,40,50};
        HashSet<Integer> h = new HashSet<>();
        int window = 4;
        int front = 0 , back = window;
        for(int i=front;i<=back;i++){
            h.add(arr[i]);
            front++;
            back++;
        }
        System.out.println(h.size());
    }
}
