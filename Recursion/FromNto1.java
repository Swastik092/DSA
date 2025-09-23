public class FromNto1 {
    static void fun1(int n){
        if(n==0){
            return;
        }else{
            System.out.println(n);
            fun1(n-1);
        }
    }
    public static void main(String[] args) {
        fun1(9);
    }
}
