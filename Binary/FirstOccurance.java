import java.util.Scanner;

public class FirstOccurance{
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 4, 5, 6};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();

        int l = 0;
        int h = arr.length - 1;
        int result = -1;

        while(l <= h){
            int mid = (l + h) / 2;
            if(arr[mid] < a){
                l = mid + 1;
            }else if(arr[mid] > a){
                h = mid - 1;
            }else{
                result = mid;
                h = mid - 1;
            }
        }
        if(result != -1){
            System.out.println("First occurrence at index: " + result);
        }else{
            System.out.println("The element not found");
        }
    }
}
