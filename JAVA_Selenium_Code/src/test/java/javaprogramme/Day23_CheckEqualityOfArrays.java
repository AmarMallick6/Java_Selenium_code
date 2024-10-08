package javaprogramme;

import java.util.Arrays;

public class Day23_CheckEqualityOfArrays {

	public static void main(String[] args) {
		int x[]= {1,3,4,5};
		int y[]= {1,3,4,5};
		//Using Build-in Methods...............
		boolean status = Arrays.equals(x, y); 
		if ( status==true) {
			System.out.println("Both are Equal");
		}else {
			System.out.println("Both are not  Equal");
		}
		//Using Logic.................................
	    boolean	output=true;
		if (x.length==y.length) {
			for (int i = 0; i < x.length; i++) {
				if (x[i]!=y[i]) {
					output=false;} }
		}else {
			output=false;
		}

		if (output==true) {
			System.out.println("Both arrays are same");
		}else {
			System.out.println("Both arrays are not  same");
		}
				
			
	}	

}
