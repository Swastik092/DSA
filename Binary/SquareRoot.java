import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int x = sc.nextInt();
        System.out.println("The square root is:" + squareroot(x));
    }
    public static int squareroot(int x){
        int low = 0 , high = x , ans = 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(mid*mid == x)
                return mid;
            else if(mid*mid > x){
                high = mid -1;
            }else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
