package javaprogramme;

public class Day36_Oct25_Nan {

	public static void main(String[] args) {
		/*NaN signifies an undefined numerical result,
		 *  whereas null indicates the absence of a reference to an object.
		 * NaN is created by operations like dividing zero by zero,
		 *  taking the square root of a negative number, 
		 * or performing arithmetic operations on undefined values.
		 * Not a Number(NaN) -->It is not a type of exception, the data type of NaN is also a number.
		 * You cannot use the == operator to check for NaN because NaN is not equal to anything, including itself.
            Use the isNaN() method instead.
		 */
		
		 
		// System.out.println(2/0); // output : ArithmeticException
		 System.out.println(0.0/0.0); // output : NaN
		 System.out.println(Math.sqrt(-5)); // output : NaN
		 System.out.println(1.0/0.0);  // output : Infinity

	}

}
