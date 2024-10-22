package demoOfArrayAndArrayList;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 1. Array is used to Stored multiple same types of data (Homogeneous DataType).
		 * 2.In Array we can store primitive & non-primitive DataType.
		 * 3.In object type Array we can store Heterogeneous DataType(multiple data type).
		 * 4.If  value of  Array present in  rows format is known as Single Dimensional Array.
		 * 
		 */
//Declaring An Array (Where Array length size is  fixed & not need to to update in Future)
		//DataType Variable[]=new Variable[size];
		int ar[]= new int [3];
//Declaring An Array (Where Array length size is not fixed &  need to to update in Future)	
		char c[]= {'A','B'};

//Add elements in Array>>>>>>>>>>>>>>>>>>>>>>>
		ar[0]=10;
		ar[1]=30;
		ar[2]=50;
//Accessing data present in Array>>>>>>>>>>>>>>>>
		System.out.println(ar[0]);
	
//Updating Array elements value >>>>>>>>>>>>>>>>>
	ar[0]= 20;
	System.out.println("After update new value :"+ ar[0]);
	
//Access all values from an  Array>>>>>>>>>>>>>>>>>>>>>>>>>>
	for (int i = 0; i < ar.length; i++) {
		System.out.print(ar[i]+ " "); //output -->20 30 50 
	}
	System.out.println("\n"+c[0]);   //"\n" is optional 
//Count Number of elements present in Array>>>>>>>>>>>
	 System.out.println( "Array size :"+ar.length);
}
}