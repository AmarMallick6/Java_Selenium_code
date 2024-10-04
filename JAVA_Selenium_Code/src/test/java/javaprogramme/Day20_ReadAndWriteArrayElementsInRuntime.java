package javaprogramme;

import java.util.Arrays;
import java.util.Scanner;

public class Day20_ReadAndWriteArrayElementsInRuntime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x[]=new int[4];
		for (int i = 0; i < x.length; i++) {
			System.out.println("Enter the value for the position "+i+":");
			x[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(x));
		
         
	}

}
