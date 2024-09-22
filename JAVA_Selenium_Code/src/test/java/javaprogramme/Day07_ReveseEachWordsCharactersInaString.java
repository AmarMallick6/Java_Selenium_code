package javaprogramme;

public class Day07_ReveseEachWordsCharactersInaString {

	public static void main(String[] args) {
		// Approach-01>>>>>>>>>>Using Build In Methods...............
		String s = "Hello Amar Kumar";
		 String[] words = s.split(" ");
		 String revword="";
		 for (String word : words) {
			 
			 StringBuilder sb = new StringBuilder(word);
			 sb.reverse();
			revword=revword+sb.toString()+" ";
			
		}
           System.out.println(revword);
          
        // Approach-02>>>>>>>>>>Using Logic...............
           String name = "Narendra Das Gandhi";
           String[] wrds = name.split("\\s");
          
           String revname = "";
           for (String w : wrds) {
        	   String revw ="";
        	  for (int i = w.length()-1; i >=0; i--) {
        		  revw= revw+w.charAt(i);
				
			} 
			  revname= revname+revw+" ";
		}
           System.out.println(revname);
	}

}
