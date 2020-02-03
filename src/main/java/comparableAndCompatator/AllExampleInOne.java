package comparableAndCompatator;

import java.text.Collator;

public class AllExampleInOne {

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
        
     // Compare s1 and s2 
        // It should return 0 as they both 
        // have the same ASCII value 
        System.out.println(s1 + " .compareTo " + s2 
                         + ": " + s1.compareTo(s2)); 
  
        // Compare s1 and s3 
        // It should return -32 as they both 
        // have the different ASCII value 
        System.out.println(s1 + " .compareTo " + s3 
                         + ": " + s1.compareTo(s3)); 
  
        // Compare s3 and s2 
        // It should return 32 as they both 
        // have the different ASCII value 
        System.out.println(s3 + " .compareTo " + s2 
                         + ": " + s3.compareTo(s2)); 
  
        // Compare s1 and s4 
        // It should return 0 as they both 
        // have the same ASCII value 
        System.out.println(s1 + " .compareTo " + s4 
                         + ": " + s1.compareTo(s4)); 
        
     // Compare s1 and s2 
        // It should return true as they both 
        // have the same content 
        System.out.println(s1 + " .equalsIgnoreCase " + s2 
                         + ": " + s1.equalsIgnoreCase(s2)); 
  
        // Compare s1 and s3 
        // It should return true as they both 
        // have the same content being case insensitive 
        System.out.println(s1 + " .equalsIgnoreCase " + s3 
                         + ": " + s1.equalsIgnoreCase(s3)); 
  
        // Compare s2 and s3 
        // It should return true as they both 
        // have the same content being case insensitive 
        System.out.println(s2 + " .equalsIgnoreCase " + s3 
                         + ": " + s2.equalsIgnoreCase(s3)); 
  
        // Compare s1 and s4 
        // It should return true as they both 
        // have the same content 
        System.out.println(s1 + " .equalsIgnoreCase " + s4 
                         + ": " + s1.equalsIgnoreCase(s4)); 
        
     // Compare s1 and s2 
        // It should return true as they both 
        // refer to same object in memory 
        System.out.println(s1 + " == " + s2 
                         + ": " + (s1 == s2)); 
  
        // Compare s1 and s3 
        // It should return true as they both 
        // refer to same object in memory 
        System.out.println(s1 + " == " + s3 
                         + ": " + (s1 == s3)); 
  
        // Compare s2 and s3 
        // It should return true as they both 
        // refer to same object in memory 
        System.out.println(s2 + " == " + s3 
                         + ": " + (s2 == s3)); 
  
        // Compare s1 and s4 
        // It should return fasle as they both 
        // refer to different object in memory 
        System.out.println(s1 + " == " + s4 
                         + ": " + (s1 == s4)); 
        
        // Compare s1 and s2 
        // It should return true as they both 
        // have the same content 
        System.out.println(s1 + " .equals " + s2 
                         + ": " + s1.equals(s2)); 
  
        // Compare s1 and s3 
        // It should return false as they both 
        // have the different content 
        System.out.println(s1 + " .equals " + s3 
                         + ": " + s1.equals(s3)); 
  
        // Compare s2 and s3 
        // It should return false as they both 
        // have the different content 
        System.out.println(s2 + " .equals " + s3 
                         + ": " + s2.equals(s3)); 
  
        // Compare s1 and s4 
        // It should return true as they both 
        // have the same content 
        System.out.println(s1 + " .equals " + s4 
                         + ": " + s1.equals(s4)); 
    } 

}
