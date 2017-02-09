package lv12_vererbung_polimorphie;

public class Bundesland extends Land {

	private double bruttoSozialProdukt;

	public Bundesland(double bruttoSozialProdukt) {
		super();
		this.bruttoSozialProdukt = bruttoSozialProdukt;
	}

	@Override
	public double getBruttoSozialProdukt() {
		// TODO Auto-generated method stub
		return this.bruttoSozialProdukt;
	}

	
	
	
}
