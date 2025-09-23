import java.util.HashSet;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int arr1[] = {10,20,30,40};
        int arr2[] = {10,30,50,20,90};

        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            h.add(arr2[i]);
        }
        System.out.print("The intersection is:");
        for(int j=0;j<arr1.length;j++){
            if(h.contains(arr1[j]))
                System.out.print(arr1[j] + " ");
        }
    }
}
