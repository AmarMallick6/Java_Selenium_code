package java_collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		// *** Collection-->implements-->Set-->implements-->HashSet ***
		// We can store homogeneous(Same data types of data)or heterogeneous(Different data type)
		
	  // It's not Follow indexing concepts........
	  // 1) Declaring HashSet.........
       HashSet<Integer> hs = new HashSet<Integer>();
      // Set<Integer>s = new HashSet<Integer>();
      // 2) Add HashS Values in HashSet.........
       hs.add(10);
       hs.add(12);
       hs.add(15);
       hs.add(20);
       System.out.println(hs);
       
	}

}
