package typecasting;

public class TypeCasting_datatype {

	public static void main(String[] args) {
	/*
	 * 1)TypeCasting- Converting types of data (Data type or object)	
	 * 2)UpCasting(Widening Process)- converting small data types into large data types.
	 * 3)DownCasting(Narrowing process)- Converting Large data type in to Small data type.
	 * 4)UpCasting is an Automatic process,no need to mention anything in notation/syntax but 
	    DownCasting is a manual process,need to mention lower data type	in notation.
	 * 5)In DownCasting data type  we compress/reduce the size of large data to store in small data type,due to
	      this it may miss some data .
	 *6) In DownCasting objects we can compile the code but it show run time error(throws Class cast exceptions)
	 *7)In UpCasting objects we can access only parent class methods/variable not child class .
	 *8) In TypeCasting objects  need to follow 3 rules :>>>
	 
	      #Conversion is valid or not (d & C have some relationship like child or parent ,parent or child)
	      # Assignment   is valid or not(C is either same or  child of A)
	      #The underlying object type of 'd' must be same or child of 'C' 
	            Example->> object o = new String; 
	                       StringBuffer s=((StringBuffer) o;
	            Here in this example StringBuffer is 'A',s is 'b',StringBuffer is 'C'& o  is 'd' 
	       -->If rule 1 &2 fail we get compile time error but if rule 3 fail we get runtime error. 	
		*/
		
		int a=10;
		long b=a;  // Example UpCasting  primitive data 
		System.out.println(b);
		long c=15000000;
		int d= (int) c;  // Example DownCasting  primitive data
		System.out.println(d);
		double ab=10.357;
		float f=(float) ab;
		System.out.println(f);
		double abc=123.32145;
		int i=(int) abc;  //Example DownCasting  double to int 
		System.out.println("Value Of i is:" +i); //Output is 123 (Refer point no 5 Mention in comment)
		
	    
	
	
	}

}
