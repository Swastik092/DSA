import java.util.Scanner;

public class TwoPointerPalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.nextLine();

        boolean palin = isPalindrome(str);
        System.out.println("The given string is palindrome:" + palin);
    }
    static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false; 
            }
            start++;
            end--;
        }
        return true;
    }
}
