package experiement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExecuteTest {

	public static void main(String[] args) {

       Person1 p1=new Person1("Shubham", 2);
       
       Person2 p2=new Person2("Shubham", 2);
       
       System.out.println(p1.hashCode());
       System.out.println(p2.hashCode());
       
       System.out.println(p1.equals(p2));
       
       System.out.println(p1.name.equals(p2.name));
       
       //System.out.println(p1.age.equals(p2.age));
       
       System.out.println(new Person1("Shubham", 2)
               .equals(new Person2("Shubham", 2)));
       
       if(p1.name==p2.name) {
    	   System.out.println("true -");
       }else {
    	   System.out.println("true false");
       }
       
       //Comparable.class.compare
       
       System.out.println(Integer.compare(p1.age, p2.age));
       
       System.out.println(p1.name.compareTo(p2.name));
       
       
       List<String> testStringList=new ArrayList<String>();
       testStringList.add("Ab");
       testStringList.add("Ab");
       testStringList.add("Ab");
       testStringList.add("Ab");
       
       
       List<String> testStringList2=new ArrayList<String>();
       testStringList2.add("Ab");
       testStringList2.add("Ab");
       testStringList2.add("Ab");
       testStringList2.add("Ab2");
       
       System.out.println(testStringList.equals(testStringList2));
       
       //System.out.println();
       
       Collections.sort(testStringList);
      // Collections.sort(list, );
       
       
       
       

       
	}
	
/*	private boolean doCompareEmployees(Person1 employee1, Person2 employee2) {
		int returnValue = Comparator.comparing(Person1::getID)
		    .thenComparing(Person1::getName)
		    .thenComparing(Person2::getSalary)
		    .compare(employee1, employee2);
		    if (returnValue != 0){
		        return false;
		    }   
		    return true;
		}*/

}
