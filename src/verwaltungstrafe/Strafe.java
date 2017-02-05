package verwaltungstrafe;

public class Strafe {
	
	private String vorname;
	private String nachname;
	private String kennzeichen;
	private int strafnummer;
	private double strafe;
	private byte anzahl;
	
	
	
	public void strafe (int geschwindigkeitsueberschreitung){
		
		if (geschwindigkeitsueberschreitung < 20)
			strafe+=30.0;
		
		else if (geschwindigkeitsueberschreitung < 30)
			strafe+=50.0;
		
		else if (geschwindigkeitsueberschreitung < 50)
			strafe+=100.0;
		
		else if (geschwindigkeitsueberschreitung < 100)
			strafe+=500.0;
		
		else 
			strafe+=1500.0;
		
		anzahl++;
		
	}
	
	
	public void verbandpaket(){
		strafe+=25;
		anzahl++;
	}
	
	public void alkohol(double wert){
		
		if (wert < 0.5)
			return ;
		
		if (wert>=0.5 && wert<=1.0)
			strafe+=100;
		
		else if (wert>1.0 && wert<=2.0)
			strafe+=400;
		
		else if (wert>2 && wert<=3.0)
			strafe+=1000;
		
		else strafe+=5000;
		
		anzahl+=2;
	}
	
	public void sonstiges (double wert){
		
		strafe+=wert;
		
	}
	

	
	public Strafe(String vorname, String nachname, String kennzeichen) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.kennzeichen = kennzeichen;
	}


	public String getVorname() {
		return vorname;
	}


	public String getNachname() {
		return nachname;
	}


	public String getKennzeichen() {
		return kennzeichen;
	}


	public int getStrafnummer() {
		return strafnummer;
	}


	public double getStrafe() {
		
		if (anzahl==1)
			return strafe*=0.7;
		
		else if (anzahl==2)
			return strafe*=0.8;
		
		else if (anzahl==3)
			return strafe*=0.9;
		
		else 
		return strafe;
	}


	public byte getAnzahl() {
		return anzahl;
	}
	
	
	

}
