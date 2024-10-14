package javaprogramme;

import java.util.Arrays;

public class Day29_SearchinganElementinArray_BinarySearch {

	public static void main(String[] args) {
		/*
		 * Condition-1 : Check Elements of Array to be Sorted order otherwise make it
		  First Sorted Ordered then Execute code.
		 */
		//Approach-01 Using Logic>>>>>>>>>>>>>>>>>>>>>>>>
		int x[]= {1,2,3,4,5,6,7};
		int key= 4;
		int l=0;  //l,h and m means low,high and medium
		int h=x.length-1;
		boolean flag=false;
		while (l<=h) {
			int m=(l+h)/2;
			if (x[m]==key) {
				System.out.println("Element is found");
				flag=true;
				break;
			}
			if (x[m]<key) {
				l=m+1;
			}
			if (x[m]>key) {
				h=m-1;
			}	
			
		}
		if (flag==false) {
			System.out.println("element is not found");
		}
		
		//Approach-02 : Using BuiltIn Methods.................
		System.out.println(Arrays.binarySearch(x, 6));
		/*
		 * In this 2nd Approach if Element is found it Will be return Index Of Array value,
		    if  Not found it will Provider negative Index values.
		 */
	}

}
