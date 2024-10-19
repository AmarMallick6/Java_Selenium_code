package javaprogramme;

import java.util.stream.IntStream;

public class Day33_PrintNumberWithOutUsingLoop {

	public static void main(String[] args) {
		
		printNumber(1);
		 printNumbers(100,120 );
      //Using Java Stream ,lambda expression >>>>>>>>>>>>>>>>>>>>>>>>
		 IntStream.range(30,51).forEach(e-> System.out.println(e));
       
	}
	//Approach-02 using Recursive  Functions & Hard coding value>>>>>>>>>>>>>>>>>>>>
	public static void printNumber(int num) {
		if (num<=10) {
			System.out.println(num);
			num++;
			printNumber(num);
		}
	}
	// using Recursive  Functions & No Hard coding value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	  public static void printNumbers(int snum,int lnum) {
		  if (snum<=lnum){
			  System.out.println(snum);
			  snum++;
			  printNumbers(snum,lnum );
		}
		 
		
	}

}
