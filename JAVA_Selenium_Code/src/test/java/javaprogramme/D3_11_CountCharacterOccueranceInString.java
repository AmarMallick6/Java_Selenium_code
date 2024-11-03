package javaprogramme;

public class D3_11_CountCharacterOccueranceInString {

	public static void main(String[] args) {
		String s = "BHARAT";
		System.out.println("Total Length of String :" + s.length());
		System.out.println("After Replace Character String Length :" + s.replace("A", "").length());
		int Character_Occureance = (s.length() - s.replace("A", "").length());
		System.out.println("Total Number of time Character Occured :" + Character_Occureance);
	}

}
