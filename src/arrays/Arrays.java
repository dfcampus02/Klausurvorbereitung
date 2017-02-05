package arrays;

public class Arrays {

	public static void main(String[] args) {
		double[][] A3x2 = { { 1, 2 }, { 2, 3 }, { 3, 4 } };

		printMatrix(A3x2);

		int[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		containsNumbers(myArray, 99);
		//
		// System.out.println(calculateSum(myArray));
		//
		// printArray(myArray);
		//
		// printArray(reverse(myArray));

		// double identity [][] =generateIdentityMatrix(3);

		// printMatrix(identity);
		

	}

	public static boolean containsNumbers(int[] numbers, int n) {

		for (int i = 0; i < numbers.length; i++) {

			if (n == numbers[i]) {
				System.out.println(n + " ist in meinem Array");
				return true;
			}
		}
		System.out.println(n + " ist NICHT in meinem Array");
		return false;
	}

	public static int calculateSum(int[] numbers) {

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {

			sum += numbers[i];

		}

		return sum;

	}

	public static void printArray(int[] numbers) {
		System.out.print("{");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");

		}

		System.out.print("}");
		System.out.println();
	}

	public static int[] reverse(int[] original) {
		int[] reverse = new int[original.length];
		int j = 0;
		for (int i = 0; i < original.length; i++) {

			reverse[i] = original.length - j;
			j++;

		}

		return reverse;
	}

	public static double[][] generateIdentityMatrix(int size) {
		double[][] identity = new double[size][size];
		for (int i = 0; i < identity.length; i++) {
			for (int j = 0; j < identity[i].length; j++) {
				if (i == j) {
					identity[i][j] = 1.0;
				}
			}
		}
		return identity;

	}

	public static void printMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t ");

			}
			System.out.println();

		}
	}

	
	}

