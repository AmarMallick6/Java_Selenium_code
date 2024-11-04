package javaprogramme;

public class D4_11_RemoveJunkFromString {

	public static void main(String[] args) {
		String s = "B!@#H!@#A*&^R#$%$#%$A&(*&(T";
		String newString = s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(newString);

	}

}
