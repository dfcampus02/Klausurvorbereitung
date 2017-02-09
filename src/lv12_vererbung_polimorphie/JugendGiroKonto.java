package lv12_vererbung_polimorphie;

public class JugendGiroKonto extends GiroKonto {
 private double buchungslimit;

public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
	super(inhaber, limit);
	this.buchungslimit = buchungslimit;
}

@Override
public void einzahlen(Double wert) {
	this.kontostand+=wert;
}

@Override
public void auszahlen(Double wert) {
	if (wert<=buchungslimit)
		this.kontostand-=wert;
	else System.out.println("Buchungslimit = " + buchungslimit);
}
 
}
