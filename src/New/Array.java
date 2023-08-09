package New;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
	
		int a []= {10,20,30,40,50}; //Array
		
		System.out.println(a.length); //calculate size of array
		
		System.out.println(a [0] ); //Starts form (ZERO)
		
		//System.out.println(a [5]);//exception index value exceed we will get Exception
		
		System.out.println(Arrays.toString(a));//1st approach to print Array
		
		a[2]=200; //we can change /replace the value of array
		
		System.out.println(Arrays.toString(a));
		
		//a[6]=700;//we can not add new or delete exist value of array
		
		System.out.println(Arrays.toString(a));
		
//2nd Approach to print array	(loop)	
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a [i]);
		}
//3rd Approach for each loop=for(DataType New variable:oldVariable)	{ SOP }	
		
		for(int b:a)
		{
			System.out.print(b+ " ");
		}
	}
}