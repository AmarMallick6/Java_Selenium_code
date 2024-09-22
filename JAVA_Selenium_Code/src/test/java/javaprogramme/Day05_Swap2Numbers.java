package javaprogramme;

public class Day05_Swap2Numbers {

	public static void main(String[] args) {
		//Approach-01>>>>>>>>>>>>>Using 3rd variable.........
		int a=5, b=10;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(" After Swapping Value of a is :"+ a+ " And Value of b is :"+ b);
		//Approach-02>>>>>>>>>>>>>Using Arithmetic operators(+ and -).........
		int x=10,y=20;
		x=x+y; //30
		y=x-y; //10
		x=x-y; //20
		System.out.println("After swapping Value of x is :"+ x+ " And Value of y is :"+ y);
		//Approach-03>>>>>>>>>>>>>Using Arithmetic operators(* and / where,x & y !=0).........
		 x=x*y; //200
		 y=x/y; //200/10=20
		 x=x/y; //200/20=10
		 System.out.println("After swapping Value of x is :"+ x+ " And Value of y is :"+ y); 
		//Approach-04, single line >>>>>>>>>>>>>Using Arithmetic operators 
		  y=x+y-(x=y); //10+20-20=10
		 System.out.println("After swapping Value of x is :"+ x+ " And Value of y is :"+ y); 
		
	}

}
