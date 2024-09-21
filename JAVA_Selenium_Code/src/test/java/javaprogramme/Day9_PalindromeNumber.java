package javaprogramme;

import java.util.Scanner;

public class Day9_PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number is :");
		 int Number = sc.nextInt();
		 int OriginalNumber=Number;
		 
		  int rev=0;
		  while (Number!=0) {
			 rev=rev*10+Number%10;
			 Number=Number/10; 
		  } 
		  System.out.println("Reverse Number is :"+ rev);
		if (OriginalNumber==rev) {
			System.out.println("it's a Palindrome Number");
		} else {
			System.out.println("it's not  a Palindrome Number");
		}	
		

	}

}
