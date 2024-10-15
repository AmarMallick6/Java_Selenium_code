package typecasting;

class child  extends parent{
	String name = "Amar";
	void m1() {
		System.out.println("This is child class m1 method");
	}
}
class parent{
	String newname = "Prakash";
	void m2() {
		System.out.println("This is parent class m2 method");
	}
}
public class TypeCasting_Object {

	public static void main(String[] args) {
		/*
		 * Refer note present in TypeCasting_datatype class.	
		*/
		//Example-01>>>>>>
		child ch = new child(); // No TypeCasting used here we can access all parent & child class data
		System.out.println(ch.name);
		ch.m1();
		ch.m2();
		System.out.println(ch.newname);
		
	//UpCasting object>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//In UpCasting objects we can access only parent class methods/variable not child class .
		 parent p   =new child(); 
		  p.m2();
		  System.out.println(p.newname);
	 /*  parent p   =new child(); 
	   When we not know what is return type of the object we can store it in parent class variable   
	  * child c = new child();
	   when we know what type of data return the object we can store it in child class variable     
	*/
   //DownCasting object>>>>>>>>>>>>>>>>>>>>>>>>>>>	 
    //In DownCasting objects we can compile the code but it show run time error(throws Class cast exceptions)
	parent par=	new parent();  
	child chi=  (child) par;
	chi.m2();
	chi.m1();
	
	}

}
