public class From1toN {
    static void fun1(int n){
        if(n==0){
            return;
        }else{
            fun1(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        fun1(5);
    }
}
