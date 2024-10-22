package demoOfArrayAndArrayList;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// MultiDimensional Array-->  value of Array present in  rows & columns format .
		//Declaration of MultiDimensional Array
		int a[][]=new int[2][2]; //Approach-01-->where Array size is known & fixed.
		int s[][]= {{12,21},{13,31}}; //Approach-02-->where Array size is Unknown & not-fixed.
		//Add value in Array>>>>>>>>>>>>
		 a[0][0]= 10;
		 a[0][1]= 30;
		 //Access value of  Array>>>>>>>>>>>>
		 System.out.println("Array value of index 0 is :"+a[0][0]);
		 //update Array value>>>>>>>>>>>>>>>
		 a[0][0]= 20;
		 System.out.println(" UPdate Array value of index 0 is :"+a[0][0]);
		 //Count Number of elements present in Array>>>>>>>>>>>
		 System.out.println( "Array size :"+s.length);
	}

}
