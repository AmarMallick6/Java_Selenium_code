
public class D19_11_ReverseANumber {

	public static void main(String[] args) {
		int n= 345678;
		int rev=0;
		while (n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
  System.out.println("Reverse Number :"+ rev);
	}

}
