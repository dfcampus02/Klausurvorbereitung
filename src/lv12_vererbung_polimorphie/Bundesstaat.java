package lv12_vererbung_polimorphie;

import java.util.ArrayList;

public class Bundesstaat extends Land {
	
	private ArrayList<Land>laender= new ArrayList<>();
	
	public void addLand(Land l){
		laender.add(l);
	}

	@Override
	public double getBruttoSozialProdukt() {
		double bsp_gesamt=0.0;
		for (Land land : laender) {
			bsp_gesamt+=land.getBruttoSozialProdukt();
			
		}
		
		return bsp_gesamt;
	}

}
