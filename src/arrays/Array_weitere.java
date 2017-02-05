package arrays;

import 	java.util.Arrays;

public class Array_weitere {

	public static void main(String[] args) {

//Array als String Element ausführen
		
		String[] dogs = {
			    "Flocky Fluke", "Frizzi Faro", "Fanny Favorit", "Frosty Filius",
			    "Face Flash", "Fame Friscco" };
		
		System.out.println( Arrays.toString(dogs) );

//equals, clone
		
		int[] array = { 1, 2, 3, 4 };
		int[] clone = array.clone();
		System.out.println( Arrays.equals( array, clone ) );      //true
		
		int[][] a1 = { { 0, 1 }, { 1, 0 } };
		int[][] a2 = { { 0, 1 }, { 1, 0 } };
		System.out.println( Arrays.equals( a1, a2 ) );	//false
		System.out.println( Arrays.deepEquals( a1, a2 ) ); // true
		System.out.println( a1[0] );                       // zum Beispiel [I@10b62c9
		System.out.println( a2[0] );                       // zum Beispiel [I@82ba41
		
		Object[] b1 = { "1", "2", "3" };
		Object[] b2 = { "1", "2", "3" };
		System.out.println( Arrays.deepEquals( b1, b2 ) ); // true

		
		
// mehrdimensionales Array ausgeben
		int[][] ungerade =
	        { { 1, 9, 4 },
	          { 0, 2},
	          { 0, 1, 2, 3, 4 } };


		
	    for ( int zeile = 0; zeile < ungerade.length; zeile++ )
	    {
	      System.out.print("Zeile " + zeile + ": ");
	      for ( int spalte=0; spalte < ungerade[zeile].length; spalte++ )
	        System.out.print( ungerade[zeile][spalte] + " ");
	      System.out.println();
	    }
	    
	  
	    
	}

}
