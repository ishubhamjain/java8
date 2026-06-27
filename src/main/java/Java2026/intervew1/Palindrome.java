package Java2026.intervew1;

public class Palindrome {
    public static void main(String[] args) {
        isPalindrome(121);
    }

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int n=x;
        int reverseNumber =0;

        while (n<0){
            int d = n%10;
            reverseNumber = reverseNumber*10+d;
            n = n/10;
        }

        if(reverseNumber==x){
            return true;
        }
        else {
            return false;
        }

    }
}
