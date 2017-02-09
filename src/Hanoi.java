
public class Hanoi {
	
	
		public static void main(String[] args){
			
			verlegeTurm( 6,  1, 
					 2,  3);
			
			
			
	}
	public static void verlegeTurm(int hoehe, int von, 
	int nach, int ueber)
	{if(hoehe > 0){
	verlegeTurm(hoehe-1, von, ueber, nach);
	System.out.println("von "+von + " nach "+ nach);
	verlegeTurm(hoehe-1, ueber, nach, von);
	}}}
	

