public class SortedArray {
    public static void main(String[] args) {
        int arr[] = {9};
        boolean issorted = true;
        for(int i=0;i<arr.length - 1;i++){
            if(arr[i] > arr[i+1]){
                issorted = false;
                break;
            }
        }
        if(issorted){
            System.out.println("The array is sorted.");
        }else{
            System.out.println("The array is not sorted.");
        }
    }
}
