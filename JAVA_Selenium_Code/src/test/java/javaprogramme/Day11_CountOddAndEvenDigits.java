package javaprogramme;

public class Day11_CountOddAndEvenDigits {

	public static void main(String[] args) {
		int num = 254667574;
		int oc=0;
		int ec=0;
		while (num>0) {
			int reminder = num%10;
			if (reminder%2==0) {
				 ec++; 
			} else {
                  oc++;
			}
			num= num/10;
		}
		System.out.println("Odd Number is :"+oc +" Even Number is :"+ec);

	}

}
