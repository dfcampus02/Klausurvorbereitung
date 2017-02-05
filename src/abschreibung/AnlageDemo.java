package abschreibung;

public class AnlageDemo {

	public static void main(String[] args) {
		
		Anlage notebook=new Anlage("Notebook", 700.0, 4);

		Anlage notebook2=new Anlage("Notebook", 700.0, 4);

		notebook.abschreiben();
		System.out.println(notebook.getRestwert());
	
		notebook2.simulate(4, 250);
		notebook.printAnlage();
		notebook2.printAnlage();
		notebook2.renew(300.0, 4);
		notebook2.printAnlage();
	}

}
