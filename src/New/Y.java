package New;

import java.util.ArrayList;

public class Y {

	public static void main(String[] args) {
	
		ArrayList<Double> a=new ArrayList<Double>(); {
			a.add(10.10);
			a.add(20.20);
			a.add(30.30);
			a.add(40.40);
//is 1st Approach			
		System.out.println(a);		  
		
		System.out.println(a.size()); //to calculate the length of Array
		
		System.out.println(a.get(0)); //to retrive the value of specific index
		System.out.println(a.get(3)); //to retrive the value of specific index
		
		a.remove(1);				  //to remove any value at specific index
		System.out.println(a);
		
		a.add(1,15.15 );              //to add right side value
		a.add(3, 35.35);			  //to add right side value
		System.out.println(a);
		
		a.set(0, 11.11);			//to replace the value at specific given index
		
		System.out.println(a);
		
		//a.clear();
		System.out.println(a);	//to remove all
		
		System.out.println(a.contains(40.40));  
//2nd Approach to print ArrayList
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		for(int j=0; j<a.size(); j++)
		{
			System.out.println(a.get(j)); }
//3rd Approach to print ArrayList
		for(double b:a)
		{
			System.out.print(b+ " ");
		}
		}		
	}
}