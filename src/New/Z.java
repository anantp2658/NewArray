package New;

import java.util.HashSet;

public class Z {

	public static void main(String[] args) {
HashSet<String> names =new HashSet<String>();
	
	names.add("Yash");
	names.add("Yash");	
	names.add("Prathamesh");
	names.add("Kamesh");
	names.add("Aniket");
	
	System.out.println(names);
	System.out.println(names.size()); 			   //length 
	System.out.println(names.contains("Kamesh")); //to check given value in include or not
	
	names.add("Sharad");						  //add new value
	System.out.println(names);
	
	//names.clear();							 //all cleared
	System.out.println(names);
	
	names.remove("Yash");						//Remove specific value
	System.out.println(names);
//2nd Approach for each loop
	
for(String newNames:names) 
{
	System.out.println(newNames);
}
	}

}
