package javaprogramme;



public class Day18_RetriveDataFromMultiDimensionalArrays {

	public static void main(String[] args) {
		int a[][]= {{10,20},{30,40},{50,60}};
	//Approach-01 Using For Loop..................
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				System.out.print(a[r][c]+" ");
				
			}
			System.out.println();
		}
    //Approach-02 Using For-each Loop...........................
		int arr[][]= new int[2][2]; // int [][]arr= new int[2][2];
		 arr[0][0]=100;
		 arr[0][1]=200;
		 arr[1][0]=300;
		 arr[1][1]=400;
		for (int n[] : arr) {
			for (int number: n) {
				System.out.print(number + " ");
			}
			System.out.println();
		}
	}

}
