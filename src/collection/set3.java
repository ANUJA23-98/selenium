package collection;

import java.util.HashSet;

public class set3
{
	public static void main(String[]args)
{
	HashSet a=new HashSet();
	   a.add(25);
	   a.add(65);  //65
	   a.add(58);
	   a.add(18);
	   a.add(65);  //65  //we get only one time 65 in result
	   a.add(47);
	  a.add("d"); //we can use string here in "LinkedHashSet" but not in "TreeSet" 
	   a.add(48);
	   System.out.println(a);
	   //System.out.println(((Object)i: a).get(2));
}
}//we will get all elements in random 