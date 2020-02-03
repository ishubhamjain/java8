package interview;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringWithoutVowels {

	public static void main(String[] args) {
		
		
		System.out.println(reverseStringwithoutVowels("AacccbB"));

	}
	
	public static String reverseStringwithoutVowels(String name) {
		
		List<String> vowel=new ArrayList<String>();
		vowel.add("a");
		vowel.add("e");
		vowel.add("i");
		vowel.add("o");
		vowel.add("u");
		vowel.add("A");
		vowel.add("E");
		vowel.add("I");
		vowel.add("O");
		vowel.add("U");

		char[] arr=name.toCharArray();
		
		int i=0;
		int j=name.length()-1;
		
		
		while(i<j) {
			System.out.println("i = "+arr[i]);
			System.out.println("j = "+arr[j]);
			if(vowel.contains(arr[i])) {
				i++;
				continue;
			}
			if(vowel.contains(arr[j])) {
				j--;
				continue;
			}
			char t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
					
			i++;
			j--;
		}
		return new String(arr);	
	}

}
