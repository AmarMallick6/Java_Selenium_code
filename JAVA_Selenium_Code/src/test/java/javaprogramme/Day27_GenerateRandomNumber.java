package javaprogramme;

public class Day27_GenerateRandomNumber {

	public static void main(String[] args) {
		//By default math.add generate double value range between 0-1.
		double num = Math.random();
		System.err.println("Return random double value :"+ num);
		double n = Math.random()*100;
		System.err.println("Return random double digits  value :"+ n);
         int  number	=(int) (Math.random()*10);
         System.out.println("Return single digit int value :"+ number);
         int  Twodigit_number	=(int) (Math.random()*100);
         System.out.println("Return double digit int value :"+ Twodigit_number);
	}

}
