package javaprogramme;

public class Day25_FindMaxandMinNumberInArray {

	public static void main(String[] args) {
		int x[]= {10,25,30,18,45};
		int max=x[0];
		for (int i = 1; i < x.length; i++) {
			if (x[i]>max) {
				max=x[i];
			}
			
		}
		System.out.println("Max. Number is :"+ max);
		int a[]= {20,13,25,97};
		int min=a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Min. Number is :"+ min);
	}

}
