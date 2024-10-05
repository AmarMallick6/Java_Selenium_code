package javaprogramme;

public class Day21_CountNumberOfTimeSpecificvalueUsedInArray {

	public static void main(String[] args) {
		int x[]= {1,2,2,3,3,4,2,2,3,1,5,6,};
		int count=0;
		int num=3;
		for (int i = 0; i < x.length; i++) {
			if (x[i]==num) {
				count++;
			}
			
		}
		System.out.println("Count Number is :"+ count);
	}
}
