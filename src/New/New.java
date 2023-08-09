package New;

import java.util.Arrays;

public class New {        //Q."Aniket","Prathamesh", "Kamesh","Yash"

	public static void main(String[] args) {

String [] a = {"Aniket","Kamesh","Prathamesh", "Yash"};
		
System.out.println(a.length);
System.out.println(a[1]);
System.out.println(a[2]);

//1st Approach
System.out.println(Arrays.toString(a));

//2nd Approach
a[0]="Swapnil";

System.out.println(Arrays.toString(a));

//3rd Approach

for(int i=0; i<a.length; i++)
{
	System.out.println(a [i]);
}

for(String b:a)
{
	System.out.print(b+ " ");
}
}
}