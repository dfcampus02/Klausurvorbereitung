package arrays;

public class StatsHelper {

	public static void main(String[] args) {
		
		int [][]numbers= {{12,4,5},{5,8,9},{7,8,9}};
		double []result= calcSimpleStat(numbers);
		int [][]numbers1= {{-2,4,-5},{5,8,9},{7,8,9}};
		double []result1= calcSimpleStat(numbers1);
		printArray(result);
		printArray(result1);
		int length=getLength(numbers);
		System.out.println(length);
		double[]oneDim=oneDimension(numbers);
		printArray(oneDim);
		
//		int [][]test= new int [3][5];
//		int index=0;
//		for (int i = 0; i < test.length; i++) {
//			for (int j = 0; j < test[0].length; j++) 
//				test [j][i]=++index;}
//		
//		printDoubleArray(test);
	}
	
	public static int getLength(int[][] numbers){
		
		int a=0;
		int b=0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++);
			a=numbers.length;
			b=numbers.length;
			}
		return a*b;
	}
	
	//int[]result=new int [numbers.length*numbers[0].length];
	
	
	public static double[] oneDimension(int[][] numbers){
		int a=0;
		double [] oneDimension=new double[getLength(numbers)];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++){
				oneDimension[a]=numbers[i][j];
				a++;
			
			}}
				
		
		
		return oneDimension;
	}

	public static double[] calcSimpleStat(int[][] numbers) {

		double min = Integer.MAX_VALUE;
		double max=0;//Integer.MIN_VALUE
		double count=0;
		double sum=0;
		double[] result = new double[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				if (numbers[i][j] < min) {
					min = numbers[i][j];
					result[0] = min;}
				
					else	if (numbers[i][j] > max) {
					max = numbers[i][j];
					result[1] = max;
					
				}
				
				sum+=	numbers[i][j];
				count++;
				result[2]=sum/count;
			}
		}return result;
	}
	
public static void printArray(double []array){
	for (int i=0; i<array.length; i++){
	System.out.print(array[i]+ "\t ");
}}}
//	public static void printDoubleArray(int [][]array){
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[0].length; j++) {
//		System.out.print(array[i][j]+ "\t ");
//	}
//}}}

