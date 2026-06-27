package Java2026.Interview2;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }

    public static boolean isPrime(int num){
        int temp;
        boolean isPrime = false;

        for(int i=2;i<num/2;i++){
            temp = num%i;

            if(temp==0){
                isPrime=true;
                break;
            }
        }
        return isPrime;
    }
}
