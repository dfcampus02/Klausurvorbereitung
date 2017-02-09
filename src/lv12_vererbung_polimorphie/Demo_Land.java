package lv12_vererbung_polimorphie;

public class Demo_Land {

	public static void main(String[] args) {
		Bundesland graz = new Bundesland(13_000);
		Bundesland wien = new Bundesland(20_000);
		
		Bundesstaat oesterreich= new Bundesstaat();
		oesterreich.addLand(wien);
		oesterreich.addLand(graz);
		
		System.out.println(oesterreich.getBruttoSozialProdukt());

	}

}
