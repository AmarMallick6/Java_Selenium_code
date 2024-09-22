package javaprogramme;

public class Day02_PalindromeName {

	public static void main(String[] args) {
		String name = "MADAM";
		System.out.println( "Before Reverse name  is :"+ name);
		String rev = "";
		for (int i = name.length()-1; i >=0; i--) {
			
			rev= rev+name.charAt(i);
		}
         System.out.println( "After Reverse name  is :"+rev);
         
  //Here we can't use == method to comparison because it's use for comparison  to objects not values.
         if (name.equals(rev)) 
         {
			System.out.println("It is a Palindrome Name");
		}else {
			System.out.println("It is  not a Palindrome Name");
		}
	}

}
