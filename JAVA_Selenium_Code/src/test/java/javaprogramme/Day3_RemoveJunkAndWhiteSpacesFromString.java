package javaprogramme;

public class Day3_RemoveJunkAndWhiteSpacesFromString {

	public static void main(String[] args) {
    //1)Remove Junk or Special Characters ..............
		String s = "A!@#$mar)(*&^%%12@#$3";
     String  snew = s.replaceAll("[^a-zA-Z0-9]", "");
     System.out.println(snew);
    //2)Remove White Spaces ..............
     String m = "  A  m  a  r  ";
     String m1 = m.replaceAll("\\s", "");
     System.out.println("After removing Space :"+ m1);
     //3)Remove White Space From Start and end of a name ..............  
     String s1 = "  Amar  ";
     System.out.println(s1.trim());
	}

}
