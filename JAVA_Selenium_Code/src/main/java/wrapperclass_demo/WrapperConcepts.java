
package wrapperclass_demo;

/**
 * we can not directly used primitive data into collections because we can not create object of primitive data ,
 * so we need wrapper class to use it.
 * Wrapper class is used for data conversations and in collections.
 * By default text box of WebElemnt take  value as String format.
 * String can not convert in to character wrapper class,because it will capture single char but
   In String available multiple characters.
 */
public class WrapperConcepts {

	
	public static void main(String[] args) {
		//Example : convert String to primitive  data type.
		String number = "250";
		int num = Integer.parseInt(number);
		System.out.println(num);
       String b = "true"; //  Any string value except true if convert it into boolean o/p  will false.
       boolean value=Boolean.parseBoolean(b);
       System.out.println("Value is :"+ value);
       
	}

}
