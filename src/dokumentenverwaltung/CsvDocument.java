package dokumentenverwaltung;

import java.util.ArrayList;

public class CsvDocument extends Document {

	private ArrayList<String>lines= new ArrayList<>();

	public CsvDocument(String fileName, ArrayList<String> lines) {
		super(fileName);
		this.lines = lines;
	}

	@Override
	public void printDocument() {
		System.out.println("CsvDocument: " 
				+ fileName+lines);
		
	}
	
	public void addLine(String line){
		lines.add(line);
	}
	
}
