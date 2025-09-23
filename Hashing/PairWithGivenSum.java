import java.util.*;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int sum = 11;
        HashSet<Integer> h = new HashSet<>();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int complement = sum - arr[i];
            if (h.contains(complement)) {
                System.out.println("Pair found: (" + arr[i] + ", " + complement + ")");
                found = true;
                break;
            }
            h.add(arr[i]);
        }
        if (!found) {
            System.out.println("Pair not found");
        }
    }
}
