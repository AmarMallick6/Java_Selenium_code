package javaprogramme;

import java.util.HashSet;

public class Day26_FindDuplicatesElementsInArray {

	public static void main(String[] args) {
		//Approach-01 ........................
		int x[]= {11,12,13,14,13};
		boolean status = false;
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				if (x[i]==x[j]) {
					System.out.println("Duplicate elements are :" + x[i]);
					status=true;
				} }}
		if (status==false) {
			System.out.println("No duplicate elements are present in this Array");
		}
		
		//Approach-02 use HashSet........................
		String name[]= {"Amar","Alok","Ashok","Alok"};
		boolean result = false;
		HashSet<String> hs= new HashSet<String>();
		for (int i = 0; i < name.length; i++) {
			
			if (hs.add(name[i])==false) {
				System.out.println("Duplicate name is :"+ name[i]);
				result=true;
			}
		}
		if (result==false) {
			System.out.println("No Duplicate elements Available");
		}
	}

}
