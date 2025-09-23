public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {8,5,4,9,2};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
        }else if(arr[i] > second && arr[i] != largest){
            second = arr[i];
        }
    }
    if (second == Integer.MIN_VALUE) {
        System.out.println("There is no second largest number.");
    }else{
        System.out.println("The second largest number is:" + second);
    }
}
}
