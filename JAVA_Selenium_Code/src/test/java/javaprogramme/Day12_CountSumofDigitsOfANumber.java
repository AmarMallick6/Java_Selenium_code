package javaprogramme;

public class Day12_CountSumofDigitsOfANumber {

	public static void main(String[] args) {
		int num=1253;
		int  sum=0;
		while (num>0) {
		sum=sum+num%10;
		num=num/10;
			}
			System.out.println("Sum of All digits is :"+ sum);	

	}

}
