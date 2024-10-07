package javaprogramme;

public class Day22_OddAndEvenNumberInArray {

	public static void main(String[] args) {
	int x[]= {11,23,12,32,43,54,75,88,99};	
	//Even/Odd Numbers in Array using For & For each loop........................
	System.out.println("Even numbers are in Array ");
	for(int e:x) {
		if (e%2==0) {
			System.out.print(e + " ");
		}
		
	}
	System.out.println("\nOdd numbers are in Array ");
	for(int o:x) {
		if (o%2!=0) {
			System.out.print(o+ " ");
		}
	}
	}

}
