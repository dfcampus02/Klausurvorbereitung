package abschreibung;

public class Anlage {

	private String bezeichnung;
	private double initialWert;
	private int nutzungsdauer;
	private double restwert;
	private int alter;
	
	public void abschreiben(){
		if(alter<nutzungsdauer){
			alter++;
			restwert= Math.floor(initialWert/nutzungsdauer * (nutzungsdauer - alter));
			}
		
		else if(alter>=nutzungsdauer)
			restwert= Math.floor(initialWert/nutzungsdauer * (nutzungsdauer - alter));
	
	}
	
	public void simulate(int maxJahre, int minWert){
		for (int i=0; i<=maxJahre; i++){
			
			if (restwert>minWert){
			System.out.println("Ausgangswert ="+ restwert);
			abschreiben();
			System.out.println("Wert nach Abschreibung =" + restwert);
		
		} }
		  System.out.println("Der Restwert beträgt: "+restwert);
		
		
		
	}
	
	
	public Anlage renew (double zusatzWert, int zusatzJahre){
		 initialWert= getRestwert()+zusatzWert;
		nutzungsdauer=(getNutzungsdauer()-alter)+zusatzJahre;
		restwert=initialWert;
		alter =0;
		return new Anlage(getBezeichnung(), initialWert, nutzungsdauer );
	}
	
	public void printAnlage(){
		System.out.println("Bezeichnung: "+getBezeichnung() + "  Initialwert: "+ getInitialWert() + "  Nutzungsdauer "+ getNutzungsdauer()+ 
				" Restwert "+ getRestwert()+ " Restnutzungsdauer" + (getNutzungsdauer()-alter));
	}
	public Anlage(String bezeichnung, double initialWert, int nutzungsdauer) {
		super();
		this.bezeichnung = bezeichnung;
		this.initialWert = initialWert;
		this.nutzungsdauer = nutzungsdauer;
		restwert= initialWert;
		alter=0;
	}


	public String getBezeichnung() {
		return bezeichnung;
	}


	public double getInitialWert() {
		return initialWert;
	}


	public int getNutzungsdauer() {
		return nutzungsdauer;
	}


	public double getRestwert() {
		return restwert;
	}


	public int getAlter() {
		return alter;
	}
	
	
}
