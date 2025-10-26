
import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {
    public static boolean isBalanced(String str){
        Deque<Character> s = new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }else if (!matching(s.peek(),ch)){
                    return false;
                }else{
                    s.pop();
                }
            }
        }
        return (s.isEmpty() == true);
    }
    public static boolean matching(char a, char b){
        boolean match = (a == '(' && b == ')') || 
                        (a == '{' && b == '}') || 
                        (a == '[' && b == ']');
        return match;
    }
    public static void main(String[] args) {
        String str = "{()[]";
        System.out.println("The parenthesis are in order?:" + isBalanced(str));
    }
}
