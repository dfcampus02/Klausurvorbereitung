package lv12_vererbung_polimorphie;

public class Demo_Konto {

	public static void main(String[] args) {
		
		Konto konto = new Konto ("Thomas");
		GiroKonto giro = new GiroKonto("Daniela", 100.0);
		JugendGiroKonto jugend = new JugendGiroKonto("Alex", 100.0, 50.0);
		SparKonto spari= new SparKonto("Mama");
		
		konto.einzahlen(100.0);
		konto.auszahlen(200.0);
		System.out.println(konto.kontostand);
		
		giro.einzahlen(100.0);
		giro.auszahlen(20.0);
		System.out.println(giro.kontostand);
		
		jugend.einzahlen(100.0);
		jugend.auszahlen(200.0);
		
		spari.einzahlen(100.0);
		spari.auszahlen(200.0);
		//************CAST**********************+
		System.out.println("*****************************");
		JugendGiroKonto jugend2Konto = new JugendGiroKonto("Alex", 100.0, 50.0);
		Konto k2g= jugend2Konto;
		k2g.einzahlen(100.0);
		k2g.auszahlen(200.0);
		System.out.println("*****************************");
		JugendGiroKonto konto2jugend= (JugendGiroKonto) k2g;
		konto2jugend.einzahlen(100.0);
		konto2jugend.auszahlen(200.0);
		

	}

}
