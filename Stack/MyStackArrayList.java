import java.util.ArrayList;

public class MyStackArrayList {
    int cap;

    public MyStackArrayList(int c){
        cap = c;
    }
    
    ArrayList<Integer> a = new ArrayList<>(cap);
    void push(int x){
        a.add(x);
    }
    int pop(){
        return a.remove(a.size()-1);
    }
    int peek(){
        return a.get(a.size()-1);
    }
    boolean isEmpty(){
        if(a.size() == 0){
            return true;
        }else{
            return false;
        }
    }
    boolean isFull(){
        if(a.size() == cap){
            return true;
        }else{
            return false;
        }
    }
    int size(){
        return a.size();
    }

    public static void main(String[] args) {
        MyStackArrayList s = new MyStackArrayList(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        System.out.println(s.size());
    }
}
