package javaprogramme;

public class Day39_Oct28_PrintStarPatterns2 {
	public  static void main(String[]args) {
	for (int r = 1; r <=5 ; r++) {
		for (int s = 4; s >=r; s--) {
			System.out.print(" ");
		}
		for (int i = 1; i <=r; i++) {
			System.out.print(" *");
		}	
			
		
		System.out.println("");
	}
	}

}
