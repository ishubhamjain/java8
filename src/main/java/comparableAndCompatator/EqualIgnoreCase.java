package comparableAndCompatator;

public class EqualIgnoreCase {

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
    } 

}
