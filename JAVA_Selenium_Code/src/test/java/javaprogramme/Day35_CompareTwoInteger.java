package javaprogramme;

public class Day35_CompareTwoInteger {

	public static void main(String[] args) {
		/*
		 *  Compare two Integer number -->>>>>>>>>>>>>>>>>>
		 *  Integer Caching: Java maintains a cache of Integer objects for values between -128 and 127.
		 *   If you assign an Integer value within this range,
		 *   Java will reuse the same object from the cache. 
		 *  Outside the cache range: For values outside the -128 to 127 range, such as 130,
		 *   Java creates a new Integer object for each assignment. 
		 *   This means num1 and num2 refer to different objects, even though their values are the same.
		 *  "  == " it compares the references /objects, not the actual integer values.
		 *   To compare the actual values of Integer objects, you should use the .equals() method.
		 */	
		
		
		//Using == Operator to compare values of two Integer.
		Integer num1=130;
		Integer num2=130;
		if (num1==num2) //output is "not equal"
		{
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are not equal");
		}
		//Using Equals Method()>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		if (num1.equals(num2)) //output is Equal
		{
		    System.out.println("Both are equal");
		} else {
		    System.out.println("Both are not equal");
		}

	}

}
