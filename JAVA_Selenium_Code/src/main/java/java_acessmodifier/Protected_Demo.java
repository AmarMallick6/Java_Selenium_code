
package java_acessmodifier;

import java_acessmodifier.package1.Class1;

/**
 * protected is keyword used before methods and variables.
 * We can access inside package  directly and using Inheritance concepts we can access it  outside package.
 * 
 */
public class Protected_Demo extends Class1 {

	public static void main(String[] args) {
		Protected_Demo pd = new Protected_Demo();
		System.out.println(pd.x);
          pd.userName();
	}

}
