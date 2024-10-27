package javaprogramme;

public class Day38_Oct27_StarPatterns {

	public static void main(String[] args) {
		for (int row = 1; row <=5; row++) {
			
			for (int space = 4; space >=row; space--) {
				System.out.print(" ");
			}
			for (int star = 1; star <=row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	

}
