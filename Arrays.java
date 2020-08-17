public class Arrays {
	public static void main(String[] args) {

		int[]   onedimension_number = {10,20,30,40};
		int[][] twodimension_number = {{1,2,3,4},
											  {5,6,7,8},
											  {9,10,11,12},
											  {13,14,15,16}};
      //print all value in array 1_dimension
		for (int i = 0; i < onedimension_number.length; i++) {
			System.out.println(onedimension_number[i]);
		}

		//print all value in array 2_dimension
		for (int j = 0; j < twodimension_number.length; j++) {
			for (int k = 0; k < twodimension_number[j].length; k++) {
				System.out.println(twodimension_number[j][k]);
		}
			}


	}
}
