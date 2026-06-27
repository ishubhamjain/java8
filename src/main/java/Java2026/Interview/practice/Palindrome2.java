package Java2026.Interview.practice;

public class Palindrome2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(29942));
    }

    public static boolean isPalindrome(int x){
        int n=x;
        int reverseNumber = 0;

        if (x<0){
            return false;
        }

        while (n>0){
            int d = n%10;
            reverseNumber=reverseNumber*10+d;
            n=n/10;
        }
        if (reverseNumber==x){
            return true;
        } else {
            return false;
        }

    }

}
