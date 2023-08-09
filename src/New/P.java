package New;

import java.util.Arrays;

public class P {

	public static void main(String[] args) {
		String a []=new String [4]; //2nd Approach to print Array

		a[0]="Aniket";
		a[1]="Swapnil";
		a[2]="Kamesh";
		a[3]="Prathamesh";

		System.out.println(Arrays.toString(a));

		System.out.println(a.length);

		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(String b:a)
		{
			System.out.print(b +" ");
		}
		

	}

}
