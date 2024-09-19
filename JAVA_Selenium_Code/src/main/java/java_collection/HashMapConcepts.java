package java_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcepts {

	public static void main(String[] args) {
		//Map(Interface)>>implements --> HashMap class
		// We can store elements like (keys,value)Pairs.
		//Keys are unique but we can use duplicate value. Consider new value as a update value 
	//1)Syntax of declaring  HashMap........................................
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
       //  Map<Keys, Value> m=new HashMap<Keys, Value>();
	//Add elements in HashMap....................
		hm.put(0, "Sunday");
		hm.put(1, "Monday");
		hm.put(2, "Tuesday");
		hm.put(6, "Saturday");
		System.out.println(hm);
	//Retrieve  specific elements  value from HashMap....................
	 System.out.println(hm.get(0));  //enter key as Input get value as output
	//Retrieve  all elements   values from HashMap.............
	 System.out.println("All values are return in Set Format :"+ hm.values());
	//Retrieve  all elements  as pairs (keys & value) from HashMap....................
	 System.out.println("All pairs are return in Set Format :"+ hm.entrySet());
	
	}

}
