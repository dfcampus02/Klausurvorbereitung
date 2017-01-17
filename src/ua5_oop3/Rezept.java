package ua5_oop3;

public class Rezept {
 private String name;
 
 private byte person;
 
 Zutat [] zutaten = new Zutat [10];

public Rezept(String name, byte person, Zutat[]) {
	super();
	this.name = name;
	this.person = person;
	this.zutaten = zutaten;
}

public String getName() {
	return name;
}

public byte getPerson() {
	return person;
}

public Zutat[][] getZutaten() {
	return zutaten;
}
 
 public void printRezept(){
	 
	System.out.print( getName()+ ": ");
	 
	 for (int i=0; i<zutaten.length; i++){
		 System.out.print(zutaten[i]);
		 
	 }
 }
 
 public Rezept umrechnen (int personen){
	 Zutat[][] newRezept= new Zutat();
	Zutat[][].getMenge();
	 
 }
 
}
