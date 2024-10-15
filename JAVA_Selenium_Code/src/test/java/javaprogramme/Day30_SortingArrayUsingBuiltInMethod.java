package javaprogramme;

import java.util.Arrays;

public class Day30_SortingArrayUsingBuiltInMethod {

	public static void main(String[] args) {
		int a[]= {13,23,11,42,33,21};
		System.out.println("Before Sorting Array value is :"+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sorting Array value is :"+ Arrays.toString(a));
        
		String s []= {"Abc","Def","Xyz","Pqr"};
		System.out.println("Before Sorting Array value is :"+ Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("After Sorting Array value is :"+ Arrays.toString(s));
	}

}
