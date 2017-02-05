package arrays;

public class ZweidimensionaleArrays {

	public static void main(String[] args) {
		
		double[][] A3x2 = { { 1, 2 }, { 2, 3 }, { 3, 4 } };
		printMatrix(A3x2);

//		1.0	 2.0	 
//		2.0	 3.0	 
//		3.0	 4.0
		
		printMatrixUmgedreht(A3x2);
//		1.0	 2.0	 3.0	 
//		2.0	 3.0	 4.0
		}
	 

		
		public static void printMatrix(double[][] matrix) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					System.out.print(matrix[i][j] + "\t ");

				}
				System.out.println();

			}
		}

		public static void printMatrixUmgedreht(double[][] matrix) {
			for (int j = 0; j < matrix[0].length; j++) {
				for (int i = 0; i < matrix.length; i++) {
					System.out.print(matrix[i][j] + "\t ");

				}
				System.out.println();

			}
		}
	}


