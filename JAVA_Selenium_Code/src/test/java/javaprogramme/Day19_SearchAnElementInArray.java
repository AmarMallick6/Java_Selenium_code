package javaprogramme;

public class Day19_SearchAnElementInArray {

	public static void main(String[] args) {
		int a[]= {12,30,50,70,75};
		int search_element=705;
		boolean staus=false;
		for (int i : a) {
			if(i==search_element) 
			{
				System.out.println("Element is present");
				staus=true;
				break;
			}
			
		}if (staus==false) {
			System.out.println("Element is not  present");
		}

	}

}
