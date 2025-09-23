public class LeaderNumber {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int n = arr.length;
        int curr_Leader = arr[n - 1];

        System.out.print("The leaders are: ");
        System.out.print(curr_Leader + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > curr_Leader) {
                curr_Leader = arr[i];
                System.out.print(curr_Leader + " ");
            }
        }
    }
}
