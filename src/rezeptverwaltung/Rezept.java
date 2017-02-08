package rezeptverwaltung;



public class Rezept {

	private String name;
	private byte personen;
	Zutat []zutaten;
	public Rezept(String name, byte person, Zutat[] zutaten) {
		super();
		this.name = name;
		this.personen = person;
		this.zutaten = zutaten;
	}
	public String getName() {
		return name;
	}
	public byte getPerson() {
		return personen;
	}
	public Zutat[] getZutaten() {
		return zutaten;
	}
	
	public void printRezept(){
		System.out.println(name);
		for (int i=0; i<zutaten.length;i++ ){
			System.out.println(zutaten[i].getName()+zutaten[i].getMenge());
		}
	}
	
	public Rezept umrechnen (byte personen){
		Zutat [] zutaten_neu= new Zutat [zutaten.length];
		int faktor =  personen / this.personen ;
		for (int i= 0; i<zutaten_neu.length; i++){
			zutaten_neu[i] = new Zutat(zutaten[i].getName(),zutaten[i].getMenge() *faktor);
			
		}
		 return new Rezept(this.name, personen, zutaten_neu);
	}
}
