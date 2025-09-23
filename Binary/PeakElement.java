public class PeakElement {
    public static void main(String[] args) {
        int arr[] = {1,2,45,6,8};
        int Pea = Peak(arr);
        System.out.println("The peak element is:" + Pea);
    }


    public static int Peak(int arr[]){
        if(arr[0] > arr[1])
            return arr[0];
        if(arr[arr.length-1] > arr[arr.length-2])
            return arr[arr.length-1];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
}
