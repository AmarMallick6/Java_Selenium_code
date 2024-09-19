
package java_acessmodifier;

/**
 * If no Access modifier used in before methods/variables means it's default .
 * we can access this only inside the same packages. 
 * 
 */
public class Default_Demo {

	
	public static void main(String[] args) {
		Private_ModifierDemo pm1 = new Private_ModifierDemo();
            pm1.printMethod();
           System.out.println(pm1.s1);
           
	}

}
