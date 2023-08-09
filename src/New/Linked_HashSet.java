package New;

import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {
	
		LinkedHashSet<Integer> n=new LinkedHashSet<Integer>();
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(30);						//Duplicate will not print	
			
		System.out.println(n);
		
		n.add(40);
		System.out.println(n);
		System.out.println(n.size());
		System.out.println(n.contains(40));
		
		n.remove(30);
		System.out.println(n);
		
		//n.clear();				 //To clear
		System.out.println(n);
		
//2nd Approach
		for(int a:n)
		{
			System.out.println(a + " ");
		}
	}

}
