package interview2;

public class PrimeNumbers {

	public static void main(String[] args) {
		isPrime(14);

	}
	
	public static void isPrime(int num) {
		
		int temp;
		boolean isprime=true;
		
		for(int i=2;i<=num/2;i++) {
			temp=num%i;
			if(temp==0) {
				isprime=false;
				break;
			}
		}
		
		if(isprime) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		
	}

}
