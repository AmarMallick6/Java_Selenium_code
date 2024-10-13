package javaprogramme;

import java.util.Random;

public class Day27_GenerateRandomNumber {

	public static void main(String[] args) {
		//By default math.add generate double value range between 0-1.
		//Approach-01 using Random methods..........
		double num = Math.random();
		System.err.println("Return random double value :"+ num);
		double n = Math.random()*100;
		System.err.println("Return random double digits  value :"+ n);
         int  number	=(int) (Math.random()*10);
         System.out.println("Return single digit int value :"+ number);
         int  Twodigit_number	=(int) (Math.random()*100);
         System.out.println("Return double digit int value :"+ Twodigit_number);
         //Approach-02 Using Random class..................
         Random rand = new Random();
          int random_number = rand.nextInt(100); //return value range is between 0-99
          int random_number1 = rand.nextInt(10); //return value range is between 0-9
          System.out.println("Random int value is :"+ random_number);
          System.out.println("Random int value is :"+ random_number1);
             double ran_double = rand.nextDouble();
            System.out.println("Random double value is :"+ ran_double);
            
	}

}
