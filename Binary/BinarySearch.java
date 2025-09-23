import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;
        boolean found = false;
        
        while(low <= high){
            int mid = (high + low) / 2;
            if(arr[mid] == a){
            System.out.println("The element found at index:" + mid);
            found = true;
            break;
        }else if(a > arr[mid]){
            low = mid + 1;
        }else{
            high = mid - 1;
        }
        }
        if(!found){
            System.out.println("The element is not in the array.");
        }
    }
}
