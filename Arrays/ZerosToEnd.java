public class ZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {0,0,0,0,0,0,3};
        int pointer = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[pointer] = arr[i];
                pointer++;
            }
        }
        while(pointer < arr.length){
            arr[pointer] = 0;
            pointer++;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
