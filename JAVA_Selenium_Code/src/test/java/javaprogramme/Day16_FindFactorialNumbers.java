package javaprogramme;

public class Day16_FindFactorialNumbers {

	public static void main(String[] args) {
		//we can increment/decrement  i values and multiply it and get Factorial number.
		int num =3;
		int f_number=1;
		for (int i = 1; i <=num; i++) {
		    	f_number=f_number*i;
		}
		System.out.println("Factorial number is :"+ f_number);
		
	}
}
