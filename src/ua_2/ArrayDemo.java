package ua_2;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int [] numbers ={1,2,3,4,5,6,7};
		
		int n=9;
		
		containsNumber(numbers,n);
		
		calculateSum(numbers);
		
		print(numbers);
		
		int [] reverse= reverse(numbers);
		
		print(reverse);
		
		double [][] newMatrix= generateIdentityMatrix(4);
		
		printMatrix(newMatrix);

	}

		public static boolean containsNumber(int [] numbers, int n){
			
			for (int i=0; i<numbers.length; i++){
				
				if(numbers[i]==n){
					
					System.out.println("Array contains "+n);
					
					return true;
					
				}
				
			}
			
			 System.out.println(n+ " nicht enthalten");
			 
			 return false;
			 
		}
		
		public static int calculateSum (int [] numbers){
		
			int sum=0;
			
			for (int i=0; i<numbers.length; i++){
				
				sum+=numbers[i];
				
				System.out.println(sum);
			}
			System.out.println("Gesamtsumme = "+sum);
			
			return sum;
			
		}
		
		public static void print (int [] numbers){
			
			for (int i=0; i<numbers.length; i++){
				
				System.out.print(numbers[i]+ ", ");
			}
			System.out.println();
		}
		
		public static int [] reverse (int [] numbers){
			
			int [] reverse= new int [numbers.length];
			
			for (int i=0; i<numbers.length; i++){
						
				reverse[i]= numbers[reverse.length-1-i];
			}
			
			return reverse;
		}

		public static double[][] generateIdentityMatrix(int size){
			
			double [][] identityMatrix= new double[size][size];
			
			for(int i=0; i<identityMatrix.length; i++){
				
				identityMatrix [i][i]=1.0;
			}
			
			return identityMatrix;
			
		}
		
		public static void printMatrix (double [][] matrix){
			
			for (int i=0; i<matrix.length; i++){
				
				for (int j=0; j<matrix[0].length; j++){
				
				System.out.print(matrix[i][j]+ ", ");
			}
				System.out.println();
		}
			
		}
		
}

