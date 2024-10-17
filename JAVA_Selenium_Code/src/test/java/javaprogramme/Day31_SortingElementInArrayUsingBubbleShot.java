package javaprogramme;

import java.util.Arrays;

public class Day31_SortingElementInArrayUsingBubbleShot {

	public static void main(String[] args) {
		int x[]= {7,4,2,3,1,6,5};
		System.out.println("Before Sorting Array values :" + Arrays.toString(x));
		int l=x.length;
		for (int i = 0; i < l-1; i++) {
			
			for (int j = 0; j < l-1; j++) {
				if (x[j]>x[j+1]) {
					
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
					
				}
			}
			
		}
        System.out.println("Arrays Values after Sorting :" + Arrays.toString(x));
	}

}
