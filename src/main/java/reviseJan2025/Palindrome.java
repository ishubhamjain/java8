package reviseJan2025;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int s) {
        if(s<0){
            return false;
        }

        int n = s;
        int reverseNumber = 0;

        while (n>0){
            int d = n%10;
            reverseNumber = reverseNumber * 10+d;
            n = n/10;
        }
        if(reverseNumber == s){
            return true;
        }
        else {
            return false;
        }
    }

}
