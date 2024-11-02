package javaprogramme;

public class D2_11_PallindromeString {

	public static void main(String[] args) {
		// After reverse the name if, it will be same that is known as Palindrome.
		String s = "AMMA";
		System.out.println("Before Reverse String :" + s);
		String r = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			r = r + s.charAt(i);
		}
		System.out.println("After Reverse String :"+ r);
		if (s.equals(r)) {
			System.out.println("It is a Palindrome String");
		}
	}

}
