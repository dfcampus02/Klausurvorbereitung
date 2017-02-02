package ue_1;

public class TurmRechnen {

	public static void main(String[] args) {
		int i=2;
		int j=2;
		
		while(j<10){
			System.out.print(i + " * " + j + "= ");
			
			i*=j;
			
			System.out.println(i);
			
			j++;
		}
		
		j=9;
		
		while(j>1){
			System.out.print(i + " / " + j + "= ");
			
			i/=j;
			
			System.out.println(i);
			
			j--;
		}
		
	}
	

}
