package javaprogramme;

public class Day32_Print1_100NumberWithoutUsingNumber {

	public static void main(String[] args) {
		//Approach-01>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		  int one='A'/'A'; String s="..........";
		  for (int i = one; i <=s.length()*s.length(); i++)
		   { System.out.println(i); }
		 
		//Approach-02()using ASCII value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		  //value of d =100 According to ASCII code................
		  for (int j =one ; j <= 'd'; j+=one) {
			     
			     System.out.println(j);
		     }
		
     
	}

}
