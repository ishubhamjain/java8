package interview;

public class PrimeNumber {

	public static void main(String[] args) {
		
		isprime(16);
	

	}
	
	public static void isprime(int num) {
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
			System.out.println(num+"= is a prime number");
		}else {
			System.out.println(num+"= is not a prime number");
		}
	
	}

}
