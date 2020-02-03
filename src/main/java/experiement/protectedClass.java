package experiement;

public class protectedClass extends publicClass {
	
	//@Override
	protected void name2() {
		System.out.println("I am in protected class");
		System.out.println("We can't chnage the access modifier from public to protected in child class");
	}

}
