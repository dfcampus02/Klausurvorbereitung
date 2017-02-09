package lv12_vererbung_polimorphie;

public class Konto {

	protected String inhaber;
	protected double kontostand;
	public Konto(String inhaber) {
		super();
		this.inhaber = inhaber;
		kontostand=0.0;
	}
	
	public void einzahlen(Double wert){
		this.kontostand+=wert;
	}
	public void auszahlen(Double wert){
		this.kontostand-=wert;
	}
	
}
