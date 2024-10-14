package javaprogramme;

public class Day19_SearchAnElementInArray {
    //Using Linear Search Method means Sequentially check one after another...
	public static void main(String[] args) {
		int a[]= {12,30,50,70,75};
		int search_element=75;
		boolean staus=false;
		for (int i : a) {
			if(i==search_element) 
			{
				System.out.println("Element is present ,Element is:" + i);
				staus=true;
				break;
			}
			
		}if (staus==false) {
			System.out.println("Element is not  present");
		}

	}

}
