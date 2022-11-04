package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class sort 
{
	 public static void main(String[] args)
	    {
	        SortedSet ph= new TreeSet();
	  
	        ph.add("Apple");
	        ph.add("Samsang");
	        ph.add("HP");
	  
	        // Adding the duplicate element
	       
	        ph.add("Apple");
	  
	        // Displaying the TreeSet
	        System.out.println(ph);
	  
	       
	        ph.remove("Samsang");
	        System.out.println("Set after removing "
	                           + "Samsang:" + ph);
	  
	      
	    }

}
