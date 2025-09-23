public class BinaryEquivalent {
    static void fun1(int n){
        if(n==0){
            return;
        }else{
            fun1(n/2);
            System.out.print(n%2 + " ");
        }
    }
    public static void main(String[] args) {
        fun1(10);
    }
}
