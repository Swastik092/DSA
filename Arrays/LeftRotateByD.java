import java.util.Scanner;

public class LeftRotateByD {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rotation:");
        int d = sc.nextInt();

        int temp[] = new int[d];

        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        for(int i=d;i<arr.length;i++){
            arr[i-d] = arr[i];
        }
        for(int i=0;i<d;i++){
            arr[arr.length - d + i] = temp[i];
        }
        System.out.print("The Left Rotated array by " + d + ":" );
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
