import java.util.Scanner;

public class TwoPointerApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,3,7,12,15,21};
        System.out.print("Enter the number:");
        int a = sc.nextInt();
        boolean result = Search(arr, a);
        System.out.println("The pair found:" + result);
    }

    public static boolean Search(int arr[] , int a){
        int i = 0,j = arr.length-1;
        while(i<j){
            if(arr[i] + arr[j] == a){
                return true;
            }else if(arr[i] + arr[j] < a){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
