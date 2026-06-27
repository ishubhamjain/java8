package Stryker;

public class PrimeNumber2 {
    public static void main(String[] args) {
        System.out.println(isPrime(33));
    }

    public static boolean isPrime(int num){

        for(int i=2;i<num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
