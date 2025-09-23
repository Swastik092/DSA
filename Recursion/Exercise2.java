public class Exercise2 {
    public static void fun1(int n){
        if(n == 0){
            return;
        }else{
            fun1(n-1);
            System.out.println(n);
            fun1(n-1);
        }
    }

    public static void main(String[] args) {
        fun1(3);
    }
}
