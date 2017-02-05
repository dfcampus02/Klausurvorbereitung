package charArray;

public class CharArray {

	
	private char[] charArray;

	public CharArray(char[] charArray) {
		super();
		this.charArray = charArray;
	}
	
	public void printArray(){
		for (int i=0; i<this.charArray.length;i++){
			System.out.print(this.charArray[i]);
			System.out.println();
		
		}
	}
	
	//Gibt zeichen zwischen start und end zurück
		public void print(int start, int end) {
			if (start >= 0 && end >= start && end < charArray.length) {
				for (int i = start; i < end; i++)
					System.out.print(charArray[i]);
				System.out.println();
			}
		}
	//ermittelt länge des array
		public int length() {
			return charArray.length;
		}
	}
	

