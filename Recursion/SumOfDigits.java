public class SumOfDigits {
    static int fun1(int n){
        if(n == 0){
            return 0;
        }else{
            int digit = n % 10;
            return digit + fun1(n/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(fun1(264));
    }
}
