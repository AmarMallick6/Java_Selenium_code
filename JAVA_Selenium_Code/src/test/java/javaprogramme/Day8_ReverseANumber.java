package javaprogramme;

public class Day8_ReverseANumber {

	public static void main(String[] args) {
		//Approach-01>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		int num = 12345678;
		int rev = 0;
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}	
		System.out.println("Reverse Number :"+ rev);
		//Approach-02>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		StringBuffer sb = new StringBuffer(String.valueOf(rev));
		  StringBuffer newv = sb.reverse();
		  int newnumber=Integer.parseInt(newv.toString());
		System.out.println("After once again reverse new number is :"+ newnumber);
		
		//Approach-02>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		StringBuilder sb1= new StringBuilder();
		sb1.append(newnumber);
		StringBuilder x = sb1.reverse();
		int zx=Integer.parseInt(x.toString());
		System.out.println("New reverse number :"+zx);
	}

}
