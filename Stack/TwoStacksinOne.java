public class TwoStacksinOne {
    int arr[];
    int cap,top1,top2;

    public TwoStacksinOne(int cap){
        this.cap = cap;
        top1 = -1;
        top2 = cap;
        arr = new int[cap];
    }
    
    void push1(int x){
        if(top1 < top2 - 1){
            top1++;
            arr[top1] = x;
        }else{
            System.out.println("Stack overflow");
        }
    }
    void push2(int x){
        if(top1 < top2 - 1){
            top2--;
            arr[top2] = x;
        }else{
            System.out.println("Stack Overflow");
        }
    }
    Integer pop1(){
        if(top1 > -1){
            int x = arr[top1];
            top1--;
            return x;
        }
        return null;
    }
    Integer pop2(){
        if(top2 < cap){
            int x = arr[top2];
            top2++;
            return x;
        }
        return null;
    }
    public static void main(String[] args) {
        TwoStacksinOne st = new TwoStacksinOne(4);
        st.push1(1);
        st.push2(9);

    }
}
