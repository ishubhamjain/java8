package comparableAndCompatator;

import java.text.Collator;

public class CompareMethod {

	 public static void main(String[] args) 
	    { 
	  
	        // Get Collator instance 
	        Collator collator = Collator.getInstance(); 
	  
	        // Get some Strings to compare 
	        String s1 = "Apple"; 
	        String s2 = "Apple"; 
	        String s3 = "apple"; 
	        String s4 = new String("Apple"); 
	  
	        // Compare s1 and s2 
	        // It should return 0 as they both 
	        // have the same ASCII value 
	        System.out.println(s1 + " collator.compare " + s2 
	                         + ": " + collator.compare(s1, s2)); 
	  
	        // Compare s1 and s3 
	        // It should return 1 
	        System.out.println(s1 + " collator.compare " + s3 
	                         + ": " + collator.compare(s1, s3)); 
	  
	        // Compare s3 and s2 
	        // It should return -1 
	        System.out.println(s3 + " collator.compare " + s2 
	                         + ": " + collator.compare(s3, s2)); 
	  
	        // Compare s1 and s4 
	        // It should return 0 as they both 
	        // have the same ASCII value 
	        System.out.println(s1 + " collator.compare " + s4 
	                         + ": " + collator.compare(s1, s4)); 
	        /////////////////////////////////////////////////////////////////////
	        

	    } 
}
