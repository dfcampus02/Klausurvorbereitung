package pegelverwaltung;

import java.util.ArrayList;

public class WasserstandManager {

	private ArrayList<Wasserstand> wasserstand= new ArrayList<>();
	
	
	public void addWasserstand(Wasserstand w){
		wasserstand.add(w);
	}

	public Wasserstand findById (int id){
		
		for (Wasserstand w: wasserstand) {
			if(w.getId()==id)
				return w;
		}
		System.out.println("Id existiert nicht");
		return null;
	}

	public ArrayList<Wasserstand> findAllByGewaesser (String gewaesserName){
		ArrayList<Wasserstand> wasserstandGewaesser= new ArrayList<>();
		for (Wasserstand w : wasserstandGewaesser) {
			if (gewaesserName.equals(w.getGewaessername()))
				wasserstandGewaesser.add(w);
		}
		return wasserstandGewaesser;
		//else?
	}
	
	public Wasserstand findNewestWasserstandForGewaesser (String gewaesserName){
		int max =0;
		Wasserstand wasserstandMax= null;
		for (Wasserstand w : wasserstand) {
			if (max<w.getZeitpunkt())
				max=w.getZeitpunkt();
				wasserstandMax=w;
		}
		return wasserstandMax;
	}
	
	public Wasserstand findOldestWasserstandForGewaesser (String gewaesserName){
		int old =0;
		Wasserstand wasserstandMax= null;
		for (Wasserstand w : wasserstand) {
			if (old>w.getZeitpunkt())
				old=w.getZeitpunkt();
				wasserstandMax=w;
		}
		return wasserstandMax;
	}
	
	public ArrayList<Wasserstand> findForAlarmierung(){
		ArrayList<Wasserstand> wasserstandAlarm= new ArrayList<>();
		for (Wasserstand w : wasserstandAlarm) {
			if (w.getMessWert()<=w.getMessWertFuerAlamierung())
				wasserstandAlarm.add(w);
		}
		
		return wasserstandAlarm;
			
		}
	public ArrayList<Wasserstand> findByZeitspanne (int von, int bis, String gewaesserName) {
		
		ArrayList<Wasserstand> wasserstandZeitspanne= new ArrayList<>();
		for (Wasserstand w : wasserstand) {
			if ((w.getZeitpunkt()>=von || w.getZeitpunkt()<=bis)&& gewaesserName.equals(w.getGewaessername()))
				wasserstandZeitspanne.add(w);
			
		}
		return wasserstandZeitspanne;
	}
}
