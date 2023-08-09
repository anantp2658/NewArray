package New;

import java.util.HashSet;

public class W {

	public static void main(String[] args) {
		HashSet<Integer> y =new HashSet<Integer>();
		y.add(20);
		y.add(30);
		y.add(40);
		y.add(40);
		y.add(50);
		
		System.out.println(y);
		System.out.println(y.size());        //for calculate the length
		System.out.println(y.contains(40)); //to check given value in include or not
		
		y.add(20);                  //Added new value, here duplicate value will not consider 
		System.out.println(y);     
		
		//y.clear();			   //all cleared
		System.out.println(y);     
		
		y.remove(50);			  //Remove specific value 
		System.out.println(y);
		
//2nd Approach to print HashSet	by using for each loop	
for(int a:y)
	{
	System.out.print(a +" ");
	}
	}
}
