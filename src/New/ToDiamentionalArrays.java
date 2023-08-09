package New;

public class ToDiamentionalArrays {

	public static void main(String[] args) {
		
		int a[] []= { {10,20,30,40}, {50,60} };       //Two Dimentional Array
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[0][3]);
		System.out.println(a[1][0]);		
		System.out.println(a[1][1]);
		
		
		  for(int i=0;i<a.length; i++) 
		  { 
			  System.out.println(a[i].length); 
			  } 
		  for(int j=0; j<a.length; j++) 
		  { 
			  System.out.println(a[j].length); 
			  }
		 
	}

}
