package interview2;

public class PrimeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=14;
		
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
