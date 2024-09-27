package javaprogramme;

public class Day15_CheckPrimeNumber {

	public static void main(String[] args) {
		int num=13;
		int factor_count=0;
		
		if (num>1) {
			 // Loop to count factors of the number
			for (int i = 1; i <= num; i++) {
				if (num%i==0)
					factor_count++;
			}
			
			// Prime numbers have exactly two factors: 1 and the number itself
			if (factor_count==2) {
				System.out.println("It's a Prime Number");
			}else {
				System.out.println("Not Prime Number");
			}
			
	}else {
			System.out.println("Not a Prime Number");
		}

	}		
			
			
		

}
