
import java.util.Stack;

public class PreviousGreater {
    public static void main(String[] args) {
        int arr[] = {2,6,4,3,6,7,};
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.empty() && s.peek() <= arr[i]){
                s.pop();
            }
            if(s.empty()){
                System.out.print("-1 ");
            }else{
                System.out.print(s.peek() + " ");
            }
            s.push(arr[i]);
        }
    }
}
