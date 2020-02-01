package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class test3 {

	public static void main(String[] args) {
/*
		List<String> listOne = getL1();
		List<String> listTwo = getL2();

		
		 * Collections.sort(listOne); Collections.sort(listTwo);
		 
		
		String date = "06/22/2019";

		String Xpath = "//tr[@class='dxeListBoxItemRow_PDPSTheme']/tr[contains(.,'"+date+"')]";
		
		boolean isEqual = listOne.equals(listTwo); // false
		System.out.println(isEqual);

		for (String list1 : listOne) {
			String text1 = list1;

			for (String list2 : listTwo) {

			}
		}*/
		
		
		
		
	}

	public static List<String> getL1() {
		
		Vector<Integer> gs = new Vector<Integer>();
		gs.add(1);
		
		return Arrays.asList("Uganda", "Kenaya/Nigeria", "Japan,Korea", "India");
	}

	public static List<String> getL2() {
		return Arrays.asList("Uganda", "Kenaya/Nigeria", "Japan,Korea", "India");
	}

}
