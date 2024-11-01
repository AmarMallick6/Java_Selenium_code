package javaprogramme;

public class D1_11_ReverseAString {

	public static void main(String[] args) {
		String s = "INDIAN";
		System.out.println("Before Reverse String :" + s);
		String rev = "";
		//Approach-01>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println("After Reverse String :" + rev);
		//Approach -02>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		   char[]  n   =rev.toCharArray();
		   String r = "";
		   for (int i = n.length-1; i >=0; i--) {
			r= r+n[i];
		}
		   System.out.println(r);
	  //Approach-03 : use String Buffer or Builder class.........
		   StringBuffer sb= new StringBuffer(r);
		   System.out.println("Reverse String : "+ sb.reverse());
	}

}
