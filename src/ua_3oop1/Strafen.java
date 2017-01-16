package ua_3oop1;

public class Strafen {

	private String vorname;
	
	private String nachname;
	
	private String kennzeichen;
	
	private int strafnr;
	
	private double strafe;
	
	private byte anzahl;

	public Strafen(String vorname, String nachname, String kennzeichen, int strafnummer) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.kennzeichen = kennzeichen;
		strafnr = strafnummer;
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

	public int getStrafnr() {
		return strafnr;
	}
	public double strafe() {
		return strafe;
	}
	
	public double getStrafe() {
		if (anzahl==1)
		return	strafe*=0.7;
		else if (anzahl==2)
		return	strafe*=0.8;
		else if (anzahl==3)
		return	strafe*=0.9;
		
		return strafe;
	}

	public byte getAnzahl() {
		return anzahl;
	}
	
	public void strafe (int geschwindigkeitsüberschreitung){
		
		if(geschwindigkeitsüberschreitung<20)
			strafe+=30;
		
		else if (geschwindigkeitsüberschreitung<30)
			strafe+=50;
		
		else if (geschwindigkeitsüberschreitung<50)
			strafe+=100;
		
		else if ( geschwindigkeitsüberschreitung<100)
			strafe+=150;
		
		else strafe+=1000;		
		
		
		anzahl++;
		
		}
	
	public void verbandspaket(){
		strafe+=25;
		anzahl++;
	}
	
	public void alkohol(double wert){
		if (wert<0.5)
			return;
		if (wert<1.0)
			strafe+=100;
		else if (wert<2.0)
			strafe+=400;
		else if ( wert<3.0)
			strafe+=1000;
		else strafe+=5000;
		anzahl+=2;
	}
	
	public void sonstiges(double wert) {
		
		strafe+=wert;
		anzahl++;
		
	}
		}
	
	
	

