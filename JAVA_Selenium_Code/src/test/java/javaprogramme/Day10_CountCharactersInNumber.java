package javaprogramme;

public class Day10_CountCharactersInNumber {

	public static void main(String[] args) {
		int Number = 12235433;
		int count = 0;
		while (Number!=0) {
			Number=Number/10;
			count++;
		}
		System.out.println("Total number of digit is :"+ count);
	}

}
