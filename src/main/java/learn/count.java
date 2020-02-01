package learn;

import java.util.ArrayList;
import java.util.Scanner;

public class count {

	public static void main(String[] args) {

		
		ArrayList<Integer> intval= new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value");
		String val= sc.next();
		
		while(!val.equalsIgnoreCase("quit")){
			
			int input = Integer.parseInt(val);
			intval.add(input);
			val= sc.next();
		}
		
		System.out.println(intval.toString());
		
		for(Integer v:intval) {
			if(v<0) {
				System.out.println(v+"= is Negative Value");
			}
			if(v>0) {
				System.out.println(v+"= is Postive Value");
			}
			if(v==0) {
				System.out.println(v+"= is Zero Value");
			}
		}
		
	}
}
