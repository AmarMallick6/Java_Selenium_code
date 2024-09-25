package javaprogramme;

public class Day13_FindLargestBtwn3Numbers {

	public static void main(String[] args) {
		int a=100,b=2000,c=300;
	//Approach-01 (Using Logic)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		if (a>b && a>c) {
			System.out.println("a is big number");
		} else if(b>a && b>c){
            System.out.println("b is big number");
		}else {
			System.out.println("c is big number");
		}
  //Approach-02 (Using Ternary operator)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		int large= (a>b)?a:b;
		int large_number= (c>large)?c:large;
		System.out.println("Large number is :"+  large_number);
	}

}
