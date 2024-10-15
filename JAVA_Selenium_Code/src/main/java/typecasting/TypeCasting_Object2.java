package typecasting;
class car{}
class tata extends car{}
class honda extends car{}
public class TypeCasting_Object2 {

	public static void main(String[] args) {
		/*
		 * TypeCasting Objects follow  these 3 rules  
		 * 1-Conversion is valid or not (d & C have some relationship like child or parent ,parent or child)
		 * 2- Assignment is valid or not ( C is either same or  child of A)
		 * 3-The underlying object type of 'd' must be same or child of 'C'
		     #:--> if rule 1 &2 fail we get compile time error but, if rule 3 is fail we get runtime error.#
		 * Example:-> honda h = (honda) c; // use As ## A ,b, C & d ##
		 */
		
	car ca=new honda();
	honda ho = (honda) ca;  //Rule 1,2,& 3 pass in this TypeCasting
		
    car c=new tata();
    honda h = (honda) c; //rule -1 & 2 pass but rule-3 fail 
    
	/*	  
	tata t	=new tata();
	honda hx =(honda) t;  // Rule -1 is Invalid
	
	car cx = new tata();
	honda hg = (tata)cx;  // Rule-2 is Invalid
	
	*/
	}

}
