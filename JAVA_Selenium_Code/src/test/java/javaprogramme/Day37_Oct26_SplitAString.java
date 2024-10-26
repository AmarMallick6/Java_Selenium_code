package javaprogramme;

public class Day37_Oct26_SplitAString {

	public static void main(String[] args) {

	String s = "Amar@Kumar@Mallick";
	 String w[]  = s.split("@"); 
	 for (String word : w) {
		System.out.print(word + "\t");
	}

	}

}
