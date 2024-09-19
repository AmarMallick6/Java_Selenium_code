package javaprogramme;

public class Day1_StringCharcters_Reverse {

	public static void main(String[] args) {
		String name = "INDIA";
		System.out.println(" Before Reverse Name is :"+name);
  //Approach-01 : Use  length(), charAt() and concat() methods...........
		String rev_name = "";
		for (int i = name.length()-1; i >=0; i--) {
			rev_name=rev_name+name.charAt(i);
		}
		System.out.println(" After Reverse Name is :"+ rev_name);
 //Approach-02 : Converting String to Char Array Type  methods...........
		  char[] n = name.toCharArray();
		  for (char c : n) {
			  System.out.print(c);   // now return type is char type Array we can convert it to String
			  
		}
		 
	}
	

}
