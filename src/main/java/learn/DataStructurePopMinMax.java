package learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class DataStructurePopMinMax {

	public static void main(String[] args) {

       List<Integer> list= new ArrayList<Integer>();
       list.add(-18);  
       list.add(40);  
       list.add(-45);  
       list.add(12); 
		
	    if (list.isEmpty()) {
	        throw new NoSuchElementException();
	    }
	    
	    list.remove(2);  //pop
	    list.add(99); //push
	    
	 // comparing using natural ordering
	      System.out.println("Max val: " + Collections.max(list,null));    
	      
	      System.out.println("Min val: " + Collections.min(list,null));  
	      
	     System.out.println(list.toString());
	    /*
	    int popped = s.pop();
	    if (popped == min()) {
	        minStack.pop();
	    }
	    if (popped == max()) {
	        maxStack.pop();
	    }*/
	 

	}

}
