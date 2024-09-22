package javaprogramme;

public class Day04_CountCharacterOccueranceFromString {

	public static void main(String[] args) {
		String name = "Amar kumar Mallick";
		int Total_length = name.length();
		System.out.println("Name size :" + Total_length);
		int length_afterreplacea = name.replace("a", "").length();
		System.out.println("Total Length After Removing a :" + length_afterreplacea);
		int Total_char_occurance = Total_length - length_afterreplacea;
		System.out.println("Total characters Occuerance of a is :" + Total_char_occurance);
	}

}
