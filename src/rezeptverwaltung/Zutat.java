package rezeptverwaltung;

public class Zutat {

	private String name;
	private int menge;
	public Zutat(String name, int menge) {
		super();
		this.name = name;
		this.menge = menge;
	}
	public String getName() {
		return name;
	}
	public int getMenge() {
		return menge;
	}
	
	
}
