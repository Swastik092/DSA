public class FrequencyOfAll {
    public static void main(String[] args) {
        int arr[] = {1,1,1,3,3,4,5,5,6,6,6};

        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                System.out.printf("The frequency of %d is: %d\n" , arr[i-1] , count);
                count = 1;
            }
        }
        System.out.printf("The frequency of %d is: %d\n" , arr[arr.length-1] , count);
    }
}
