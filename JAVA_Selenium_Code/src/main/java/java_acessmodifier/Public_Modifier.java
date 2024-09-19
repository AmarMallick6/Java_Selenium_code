
package java_acessmodifier;

import java_acessmodifier.package1.Class1;

/**
 * 
 * public is keyword used before methods, class and variables.
 * We can access it any  package  directly in side the same project.
 * need to import class if we use in other packages of the same project.
 * 
 */
public class Public_Modifier {

	
	public static void main(String[] args) {
		
   Class1 c1 = new Class1();
   System.out.println(c1.a);
   c1.verifyname();
	}

}
