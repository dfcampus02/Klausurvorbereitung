package lv12_vererbung_polimorphie;

public class GiroKonto extends Konto {
	
	protected double limit;

	public GiroKonto(String inhaber, double limit) {
		super(inhaber);
		this.limit = limit;
	}

	@Override
	public void einzahlen(Double wert) {
		
		super.einzahlen(wert);
	}

	@Override
	public void auszahlen(Double wert) {
		if ((kontostand-wert)<(limit*-1))
			System.out.println("Limit überzogen");
		else
		super.auszahlen(wert);
	}

//	


}
