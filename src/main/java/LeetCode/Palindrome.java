package LeetCode;

//https://www.youtube.com/watch?v=U8UnNZhoPQk&list=PLs-JnCrPsdJExy8nJZOP2AoVnvhf2SCKH&index=4
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(3223));
    }

    public static boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }

        int n = x;
        int reverseNumber = 0;

        while(n>0) {
            int d = n%10;
            reverseNumber = reverseNumber*10 + d;
            n = n/10;
        }

        if(reverseNumber == x){
            return true;
        }
        else {
            return false;
        }
    }
}
