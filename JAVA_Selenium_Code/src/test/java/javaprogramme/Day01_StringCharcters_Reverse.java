package javaprogramme;

public class Day01_StringCharcters_Reverse {

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
		String x="BHARAT";
		String r ="";
		  char[] n =x.toCharArray();
		  for (int i=n.length-1;i>=0;i--) {
			     r=r+n[i];
		  }  
		System.out.println(r);
  //Approach-03 : use String Buffer or Builder class.........
		StringBuffer sBuffer= new StringBuffer(r);
		 System.out.println(sBuffer.reverse());
	}
	

}
