class MyStack{
    int arr[];
    int cap;
    int top;
    MyStack(int c){
        cap = c;
        top = -1;
        arr = new int[cap];
    }
    void push(int x){
        if(isFull()){
            System.out.println("The stack is full.");
            return;
        }
        top++;
        arr[top] = x;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("The Stack is empty.");
            return -1;
        }
        int pop = arr[top];
        top--;
        return pop;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        return arr[top];
    }
    int size(){
        return top+1;
    }
    boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    boolean isFull(){
        if(top == cap-1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
    }
}