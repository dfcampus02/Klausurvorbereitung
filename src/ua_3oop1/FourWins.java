package ua_3oop1;

public class FourWins {

	private char[][] charArray;

	public FourWins(int sizeX, int sizeY) {
		super();
		charArray = new char[sizeX][sizeY];

		for (int i = 0; i < charArray.length; i++) {

			for (int j = 0; j < charArray[0].length; j++) {

				charArray[i][j] = ' ';

			}

		}

	}
//!!!!!
	
	public int getSizeX() {
		return charArray.length;
	}

	public int getSizeY() {
		return charArray[0].length;
	}



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
		byte counter = 0;

		char lastCharacter = ' ';

		for (int y = 0; y < charArray[0].length; y++) {

			for (int x = 0; x < charArray.length; x++) {

				if (charArray[x][y] != lastCharacter) {

					lastCharacter = charArray[x][y];

					counter = 1;
				}

				else if (charArray[x][x] != ' ') {

					counter++;
				}

				

					if (counter == 4) {

						return lastCharacter;
					
			}
		}

		lastCharacter = ' ';

		counter = 0;
			}

		return '-';
	}
	
	private char fourInColumn() {

		char lastCharacter = ' ';

		byte counter = 0;

		for (int x = 0; x < charArray.length; x++) {

			for (int y = 0; y < charArray[0].length; y++) {

				if (charArray[x][y] != lastCharacter) {

					lastCharacter = charArray[x][y];

					counter = 1;
				}

				else if (charArray[x][y] != ' ') {

					counter++;

				}

				if (counter == 4) {

					return lastCharacter;

				}

			}

		
		lastCharacter = ' ';

		counter = 0;
		}

		return '-';

	}
	public char winner() {
		if (fourInColumn() != '-')
			return fourInColumn();
		return fourInRow();
	}
}
