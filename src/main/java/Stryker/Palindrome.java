package Stryker;

public class Palindrome {
    public static void main(String[] args) {
        int val = 1234;
        isPalindrome(val);
    }

    public static void isPalindrome(int val){
        if(val<0){
            System.out.println("can't be a panlindrome");
        }

        int n=val;
        int reverse=0;
        while(n>0){
            int d = n%10;
            reverse = reverse*10+d;
            n = n/10;
        }

        if(reverse==val){
            System.out.println(val+ ": is palindrome");
        }else{
            System.out.println(val+ ": is not palindrome");
        }
    }
}
