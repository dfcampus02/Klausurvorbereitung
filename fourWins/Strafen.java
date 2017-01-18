package fourWins;

public class Strafen {
	private String vorname;
	private String nachname;
	private String kennzeichen;
	private int strafnummer;
	private double strafe;
	private byte anzahl;

	public Strafen(String vorname, String nachname, String kennzeichen, int strafnummer) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.kennzeichen = kennzeichen;
		this.strafnummer = strafnummer;
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

	public double strafe() {
		return strafe;
	}

	public double getStrafe() {
		if (anzahl == 1)
			return strafe * 0.7;
		else if (anzahl == 2)
			return strafe * 0.8;
		if (anzahl == 3)
			return strafe * 0.9;

		return strafe;
	}

	public byte getAnzahl() {
		return anzahl;
	}

	public void strafe(int geschwindigkeisueberschreitung) {
		if (geschwindigkeisueberschreitung < 20)
			strafe += 30.0;
		else if (geschwindigkeisueberschreitung < 30)
			strafe += 50.0;
		else if (geschwindigkeisueberschreitung < 50)
			strafe += 100.0;
		else if (geschwindigkeisueberschreitung < 100)
			strafe += 150.0;
		else if (geschwindigkeisueberschreitung > 100)
			strafe += 100.0;
		anzahl++;

	}

	public void alkohol(double wert) {
		if (wert < 0.5)
			return;
		if (wert >= 0.5 && wert < 1)
			strafe += 100;
		else if (wert >= 1 && wert < 2)
			strafe += 400;
		else if (wert >= 2 && wert < 3)
			strafe += 1000;
		else if (wert > 3)
			strafe += 5000;
		anzahl += 2;

	}

	public void verbandspaket() {
		// boolean verbandpaket=true;
		// if (verbandpaket!=true)
		strafe += 25;
		anzahl++;
	}

	public void sonstiges(double wert) {
		strafe += wert;
		anzahl++;
	}

}
