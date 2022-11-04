package collection;

import java.util.ArrayList;

public class list
{
public static void main(String[]args)
{
	ArrayList<Integer> a=new ArrayList<Integer>();    //<Integer>
	   a.add(25);
	   a.add(65);
	   a.add(58);
	   a.add(18);
	   a.add(65);
	   a.add(47);
	   a.add(48);
	  // a.add("s")     here we have provide <Integer> generic so we cannot provide string here
	   
	   System.out.println(a);
	   System.out.println(a.get(2));
	   
}
}
