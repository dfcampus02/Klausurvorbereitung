package lv12_vererbung_polimorphie;

public class SparKonto extends Konto {

	public SparKonto(String inhaber) {
		super(inhaber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void einzahlen(Double wert) {
		this.kontostand+=wert;
		System.out.println("Kontostand ="+kontostand);
	}

	@Override
	public void auszahlen(Double wert) {
		if (wert>kontostand)
			System.out.println("Abbuchung nicht moeglich");
		else
		super.auszahlen(wert);
	}

//	@Override
//	public void auszahlen(Double wert) {
//		if (wert<kontostand){
//			kontostand-=wert;
//		System.out.println("Kontostand ="+kontostand);}
//		else System.out.println("Abbuchung nicht moeglich");
//	}
//	

	
}
