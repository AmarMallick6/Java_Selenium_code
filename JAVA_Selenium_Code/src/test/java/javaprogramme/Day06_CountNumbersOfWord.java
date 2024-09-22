package javaprogramme;

public class Day06_CountNumbersOfWord {

	public static void main(String[] args) {
		String x = "My Name Is Amar Kumar ";
		int c =1;
		for (int i = 0; i < x.length()-1; i++) {
		if ((x.charAt(i)==' ') && (x.charAt(i+1)!=' ')) {
			c++;
		}	
			
		}
		System.out.println("Number of word is Availble is :"+ c);

	}

}
