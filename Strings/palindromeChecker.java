import java.util.Scanner;

public class palindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string:");
        String str = sc.nextLine();
        boolean reverse = isPalindrome(str);
        System.out.println("The string is a palindrome:" + reverse);
    }
    static boolean isPalindrome(String str){
        StringBuilder s = new StringBuilder(str);
        String rev = s.reverse().toString();
        if(str.equals(rev))
            return true;
        return false;
    }
}
