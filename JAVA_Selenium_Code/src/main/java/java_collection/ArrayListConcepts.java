package java_collection;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
	// *** Collection-->implements-->List-->implements-->ArrayList ***
	//We can store homogeneous(Same data types of data)or heterogeneous(Different data type)
    //1) Declaring ArrayList.........
		ArrayList<Object> al = new ArrayList<Object>(); // or >> List <>list = new ArrayList<>();
	//2)Add values in ArrayList.......
		al.add("Amar");
		al.add(100);
		al.add(true);
		al.add('M');
		al.add(10.56);
		System.out.println(al);
	//Insert a value in ArrayLiLst................
		al.set(1, "Kumar");
		System.out.println("After Inserting an element,Arraylist : "+al);
	//3) Retrieve data 	 from ArrayList............
		System.out.println(al.get(2));
		System.out.println(al.get(0));
	//4) Count no of elements present in  ArrayList............
		System.out.println(al.size());
	//5) Remove Specific elements from present in  ArrayList............
		al.remove(1); // 1 is index number
	//6) Remove Specific multiple elements from present  ArrayList............
		 //direct method not available for it so we customized it like below syntax..
		ArrayList<Object> alist = new ArrayList<Object>();
		alist.add(0,"Amar");
		alist.add(10.56);
		al.removeAll(alist);
		System.out.println(al);
	//7) Replace Specific elements from present in  ArrayList............
		 al.set(1, 'F');
		 al.set(0, false);
		System.out.println(al);
		
	//8) Remove All elements from present in  ArrayList............	
		 al.clear();
		
	}

}
