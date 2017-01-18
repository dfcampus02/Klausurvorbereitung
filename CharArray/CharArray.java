package CharArray;

public class CharArray {
	private char[] internalArray;
	public static int countObjects;

	// Konstruktor, der ein Char Array �bernimmt und einem lokalen Attribut
	// zuweist
	public CharArray(char[] param) {
		this.internalArray = param;
		countObjects++;
	}

	// Gibt den Array zecihen f�r zeichen aus
	public void print() {
		for (int i = 0; i < this.internalArray.length; i++)
			System.out.print(internalArray[i]);
		System.out.println();
	}
//Gibt zeichen zwischen start und end zur�ck
	public void print(int start, int end) {
		if (start >= 0 && end >= start && end < internalArray.length) {
			for (int i = start; i < end; i++)
				System.out.print(internalArray[i]);
			System.out.println();
		}
	}
//ermittelt l�nge des array
	public int length() {
		return internalArray.length;
	}
}
