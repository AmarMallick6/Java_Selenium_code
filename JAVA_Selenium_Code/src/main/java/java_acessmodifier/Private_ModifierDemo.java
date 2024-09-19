package java_acessmodifier;
/**
 * If private keywords mention  before methods/variables means it's private access  .
 * we can access this only inside the same class. 
 * 
 */

public class Private_ModifierDemo {
	 String s1= "Kumar";
	void printMethod() {
		System.out.println("Hello");
		
	}
	
	 private   String s = "Amar";
	 private    void setName() {
		 System.out.println("Name changed Successfully");
	 }
	public static void main(String[] args) {
   
     Private_ModifierDemo p = new Private_ModifierDemo();
     System.out.println(p.s);
	 p.setName ();

	}

}
