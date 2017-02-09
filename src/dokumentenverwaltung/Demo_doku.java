package dokumentenverwaltung;

import java.util.ArrayList;

import uebungsbeispiele_LV11_OOP.Frog;

public class Demo_doku {

	public static void main(String[] args) {
		
		
		Document doc= new Document("Dokument");
		TextDocument text= new TextDocument("Textdokument: ","lorem ipsum");
		ImageFile image = new ImageFile("image: ", 2 , 3," bunt");
		
		
		CsvDocument csv= new CsvDocument("demo.csv", new ArrayList <String>());
		csv.addLine("line1");
		csv.addLine("line2");
		csv.addLine("line3");
		
		ArrayList <String> lines= new ArrayList<>();
		lines.add("shdfk");
		lines.add("sngvskfjnv");
		CsvDocument csv2= new CsvDocument("demo.csv", lines);
		
		doc.printDocument();
		text.printDocument();
		image.printDocument();
		csv.printDocument();
		csv2.printDocument();
		//***************************************************************++
		
		Document doc2image= new ImageFile("image: ", 2 , 3," blau");
		Document docimage= image;
		doc2image.printDocument();
		docimage.printDocument();
		
		ImageFile bild = (ImageFile)doc2image;
		System.out.println("*************************");
		bild.printDocument();
		//Document doc
		//TextDocument text
		//ImageFile image
		
		
		
		//***********************************************************+
		
		PrintManager printer= new PrintManager();
		printer.addDocument(doc);
		printer.addDocument(text);
		printer.addDocument(image);
		printer.addDocument(csv);
		System.out.println();
		printer.printAll();
		System.out.println();
		printer.printAllV2();
		System.out.println();
		Document found= printer.findDocument("Dokument");
		found.printDocument();
		
		
		Document f = printer.findDocument("image: ");
		if (f != null)
		{
			System.out.println("image.png gefunden");
			f.printDocument();
		}
		f = printer.findDocument("imageXY.png");
		if (f != null)
		{
			System.out.println("imageXY.png gefunden");
			f.printDocument();
		}
		else
		{
			System.out.println("imageXY nicht gefunden");
}
	}

}
