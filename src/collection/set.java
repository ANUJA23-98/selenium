package collection;

import java.util.TreeSet;

public class set
{
	public static void main(String[]args)
	{
		TreeSet a=new TreeSet();
		   a.add(25);
		   a.add(65);  //65
		   a.add(58);
		   a.add(18);
		   a.add(65);  //65  //we get only one time 65 in result
		   a.add(47);
		 //  a.add("d"); //we cannot use string here only in "TreeSet" 
		   a.add(48);
		   System.out.println(a);
		  // System.out.println(a.get(2));   // in "set" we cannot maintain index value
		   	   
}
}  // we will get numbers in ascending order