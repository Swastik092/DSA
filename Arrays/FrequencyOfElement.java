import java.util.Scanner;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int arr[] = {10,10,10,10,1,2,3};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == n){
                count++;
            }
        }
        System.out.printf("The frequency of %d is %d" , n , count);
    }
}
