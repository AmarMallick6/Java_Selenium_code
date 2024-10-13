package javaprogramme;

import org.apache.commons.lang3.RandomStringUtils;

public class Day28_GenerateRandomStrings {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Using Apache commons-lang API
		
		String num = RandomStringUtils.randomNumeric(7);//Here range of number is 7
		System.out.println(num);
		String name = RandomStringUtils.randomAlphabetic(5); // Here range of name is 5
		System.out.println(name);

	}

}
