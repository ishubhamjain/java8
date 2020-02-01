package learn;

import java.util.HashMap;
import java.util.function.Predicate;

public class lamda{
    static String test2;
	String test;
	public static void main(String[] args) {
		p ps=()->System.out.println("kkk");
		ps.name();
		
		Predicate<Integer> j=I->I>10;
		
		//(s)->s.
		lamda lam=new lamda();
		lam.name();
		
		//HashMap<K, V>
		//HashS

	}
	
	public void name() {
		test="hhh";
		test2=test;
	}
	
	@FunctionalInterface
	interface p{
		public void name();
	}
}
