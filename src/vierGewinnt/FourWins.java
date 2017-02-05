package vierGewinnt;

public class FourWins {
	
	private char [][]charArray;
	public FourWins(int sizeX, int sizeY){
		charArray = new char[sizeX][sizeY];
		
		for (int i = 0; i< charArray.length; i++){
			for (int j = 0; j < charArray[0].length; j++){
				
				charArray[i][j]= ' ';
			}
		}
	}
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


	private char fourInRow(){
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
	}

//	int sizeX;
//	
//	int sizeY;
//	
//	char [] []charArray;
//	public FourWins(int sizeX, int sizeY) {
//		super();
//		this.sizeX = sizeX;
//		this.sizeY = sizeY;
//		
//		char [][] spielfeld = new char [sizeX][sizeY];
//		for (int i = 0; i<spielfeld.length; i++){
//			for (int j = 0; j<spielfeld[0].length; j++){
//				spielfeld [i][j]= ' ';
//			}
//		}
//	}
//
//	public int getSizeX() {
//		return sizeX;
//	}
//
//	public int getSizeY() {
//		return sizeY;
//	}
//	
//	
//	
//	
//	public boolean playerA (int x, int y){
//			if (charArray[x][y]== ' '){
//				
//				charArray[x][y]= 'A';
//				return true;
//			}
//		
//	
//	 return false;
//	}
//	
//	public boolean playerB (int x, int y){
//
//			if (charArray[x][y]== ' '){
//				
//				charArray[x][y]= 'B';
//				return true;
//			}
//		
//	return false;
//	}
//	
//	private char fourInRow(){
//		
//		char lastCharacter = ' ';
//		
//		byte counter=0;
//		
//		for (int i = 0; i<charArray[0].length; i++){
//			
//			for (int j = 0; j<charArray.length; j++){
//				
//			if (charArray[i][j]!= lastCharacter){
//				
//				lastCharacter=charArray[i][j];
//			
//			}
//			else if ((charArray[i][j]== lastCharacter))
//				
//				counter++;
//			}
//			if (counter==4){
//				
//				return lastCharacter;
//			}
//			
//			counter=0;
//			lastCharacter=' ';
//	}
//		return '-';
//	}
//	
//private char fourInColumn(){
//		
//		char lastCharacter = ' ';
//		
//		byte counter=0;
//		
//		for (int i = 0; i<charArray.length; i++){
//			
//			for (int j = 0; j<charArray[0].length; j++){
//				
//			if (charArray[i][j]!= lastCharacter){
//				
//				lastCharacter=charArray[i][j];
//			
//			}
//			else if ((charArray[i][j]== lastCharacter))
//				
//				counter++;
//			}
//			if (counter==4){
//				
//				return lastCharacter;
//			}
//			
//			counter=0;
//			lastCharacter=' ';
//	}
//		return '-';
//	}
//
//public char winner(){
//	char col=fourInColumn();
//	char row=fourInRow();
//	if (col!=' '){
//		return col;
//	}else if (row!=' '){
//		return row;
//	}
//	else return '-';

	
	

	
	
	
	
	
	
	

