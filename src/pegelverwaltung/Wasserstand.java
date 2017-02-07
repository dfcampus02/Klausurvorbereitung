package pegelverwaltung;

public class Wasserstand {

	
	private int id;
	private String gewaessername;
	private double messWert;
	private double messWertFuerAlamierung;
	private int zeitpunkt;
	public int getId() {
		return id;
	}
	public String getGewaessername() {
		return gewaessername;
	}
	public double getMessWert() {
		return messWert;
	}
	public double getMessWertFuerAlamierung() {
		return messWertFuerAlamierung;
	}
	public int getZeitpunkt() {
		return zeitpunkt;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setGewaessername(String gewaessername) {
		this.gewaessername = gewaessername;
	}
	public void setMessWert(double messWert) {
		this.messWert = messWert;
	}
	public void setMessWertFuerAlamierung(double messWertFuerAlamierung) {
		this.messWertFuerAlamierung = messWertFuerAlamierung;
	}
	public void setZeitpunkt(int zeitpunkt) {
		this.zeitpunkt = zeitpunkt;
	}
	@Override
	public String toString() {
		return "Wasserstand [id=" + id + ", gewaessername=" + gewaessername + ", messWert=" + messWert
				+ ", messWertFuerAlamierung=" + messWertFuerAlamierung + ", zeitpunkt=" + zeitpunkt + "]";
	} 
	
	
	
	
}
