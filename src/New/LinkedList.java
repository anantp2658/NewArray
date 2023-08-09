package New;

import java.util.Arrays;

public class LinkedList {

	public static void main(String[] args) {
	java.util.LinkedList<String> list =new java.util.LinkedList<>();
	list.add("Aniket");
	list.add("Kamesh");
	list.add("Prathamesh");
	
	System.out.println(list);
	System.out.println(list.size());
	
	list.add("Sharad");
	System.out.println(list);
	
	list.add(1,"Yash");
	System.out.println(list);
	
	list.remove("Kamesh");
	System.out.println(list);
	
	list.set(3, "Akash");
	System.out.println(list);
	
	list.get(1);
	System.out.println(list);
	
	System.out.println(list.contains("Yash"));
	
//2nd Approach For Loop
/*	for(String i=0; i<list.size()i++)
	{
		System.out.println(list.get(1));
	}*/
//3rd ForEach Loop	
	for(String m:list)
	{
		System.out.println(m); 
	}
	}
}
