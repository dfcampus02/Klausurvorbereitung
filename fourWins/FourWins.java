package fourWins;

public class FourWins {
//Attribut
	private char[][] charArray;
//Konstruktor
	public FourWins(int sizeX, int sizeY) {
		charArray = new char[sizeX][sizeY];
		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray[0].length; j++) {
				charArray[i][j] = ' ';
			}
		}
	}

	public int getSizeX() {
		return charArray.length;
	}

	public int getSizeY() {
		return charArray[0].length;
	}

	// Spielzug: überprüft, ob ein Feld leer ist, wenn true, wird Spielzug
	// gesetzt, sonst false
	public boolean playerA(int x, int y) {
		if (charArray[x][y] == ' ') {
			charArray[x][y] = 'A';

			return true;
		}
		return false;
	}

	public boolean playerB(int x, int y) {
		if (charArray[x][y] == ' ') {
			charArray[x][y] = 'B';

			return true;
		}
		return false;
	}

	private char fourInRow() {

		char lastCharacter = ' ';

		byte cntSameCharacters = 0;

		for (int y = 0; y < charArray[0].length; y++) {
			for (int x = 0; x < charArray.length; x++) {
				if (charArray[x][y] != lastCharacter) {
					lastCharacter = charArray[x][y];
					cntSameCharacters = 1;
				} else if (charArray[x][y] != ' ') {
					cntSameCharacters++;
				}
				if (cntSameCharacters == 4) {
					return lastCharacter;
				}
			}
			cntSameCharacters = 0;
			lastCharacter = ' ';
		}
		return '-';

	}

	private char fourInColumn() {
		char lastCharacter = ' ';
		byte cntSameCharacters = 0;

		for (int x = 0; x < charArray.length; x++) {
			for (int y = 0; y < charArray[0].length; y++) {
				if (charArray[x][y] != lastCharacter) {
					lastCharacter = charArray[x][y];
					cntSameCharacters = 1;
				} else if (charArray[x][y] != ' ') {
					cntSameCharacters++;
				}
				if (cntSameCharacters == 4) {
					return lastCharacter;
				}
			}
			cntSameCharacters = 0;
			lastCharacter = ' ';
		}
		return '-';

	}

	public char winner() {
		if (fourInColumn() != '-')
			return fourInColumn();
		return fourInRow();
	}

	// public static void printArray(char [][] anyArray){
	// for (int i=0; i<anyArray.length; i++){
	// for (int j=0; j<anyArray[i].length; j++){
	// System.out.print(anyArray[i][j]+"\t");
	// }
	// System.out.println();
	// }
	// }

}
