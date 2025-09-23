public class MaximumConsecutiveOne {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,0,0,1,1,1,1};

        int count = 0 , max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
                max = Math.max(max, count);
            }else{
                count = 0;
            }
        }
        System.out.println("The maximum number of consecutive ones is:" + max);
    }
}
