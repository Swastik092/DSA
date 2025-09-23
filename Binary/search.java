import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search.");
        int a = sc.nextInt();
        boolean found = false;

        int arr[] = {1,2,3,4,5,6,7,8};

        for(int i=0;i<arr.length;i++){
            if(arr[i] == a){
                System.out.println("Element Found at index:" + i);
                found = true;
                break;
            }
        }
        if(!found)
        System.out.println("Element not found");
    }
}

