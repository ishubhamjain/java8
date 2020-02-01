package snippet;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		List<Integer> art = new ArrayList<Integer>();
		art.add(1);
		art.add(2);
		art.add(3);
		art.add(4);
		art.add(5);

		System.out.println(logic(art,4));
	}
	
	public static String logic(List<Integer> arr, int k) {
		
		int size=arr.size();
		System.out.println(size);
		boolean result = false;
		for(int i=0;i<=size-1;i++) {
			if(arr.get(i)==k) {
				System.out.println("Interger k is present in array"+arr.get(i));
				System.out.println("index ="+i);
				result=true;
				break;
			}else {
				result=false;
			}
			
		}
		
		if(result==true) {
			return "Yes";
		}else {
			return "No";
		}
	}
}
