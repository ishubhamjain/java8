package comparableAndCompatator;

public class EqualsMethod {

	public static void main(String[] args) 
    { 
  
        // Get some Strings to compare 
        String s1 = "Apple"; 
        String s2 = "Apple"; 
        String s3 = "apple"; 
        String s4 = new String("Apple"); 
  
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
