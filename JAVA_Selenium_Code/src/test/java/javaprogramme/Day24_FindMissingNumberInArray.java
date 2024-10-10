package javaprogramme;

public class Day24_FindMissingNumberInArray {

	public static void main(String[] args) {
		int x[]= {3,4,6,7,8,9,10};
		int sum1=0;
		for (int i = 0; i < x.length; i++) {
			 sum1 =sum1+ x[i];
		}
		
		int sum2=0;
	for (int i = 3; i <=10; i++) {
		sum2=sum2+i;
	}
      
       
       System.out.println("Missing number in array is :"+ (sum2-sum1));
	}

}
