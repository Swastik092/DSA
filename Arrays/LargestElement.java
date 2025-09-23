public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {1,2,9,4,5};

        int result = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>result){
                result = arr[i];
            }
        }
        System.out.printf("The largest element is : %d" , result);
    }
}
