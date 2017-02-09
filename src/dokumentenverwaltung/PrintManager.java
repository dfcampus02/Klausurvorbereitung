package dokumentenverwaltung;

import java.util.ArrayList;

public class PrintManager {

	private ArrayList<Document> documents = new ArrayList<>();

	public void addDocument(Document d) {
		documents.add(d);
	}

	public void printAll() {
		for (int j = 0; j < documents.size(); j++) {

			documents.get(j).printDocument();
		}
	}

	public void printAllV2() {
		for (Document d : documents) {
			d.printDocument();

		}
	}
	
	public Document findDocument (String filename){
		
		for (Document d : documents) {
			if(d.fileName.equals(filename))
				return d;	
		}
		
		return null;
	}
}
