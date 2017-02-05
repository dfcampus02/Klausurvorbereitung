package generics;

import java.util.GregorianCalendar;



public class Profil {

private String vorname;
private String nachname;
private String email;
private MayBe<String> bezStatus;
private MayBe<Integer> alter;
private MayBe<Double> gehalt;
private MayBe<GregorianCalendar> gebDatum;


public Profil(String vorname, String nachname, String email, MayBe<String> bezStatus, MayBe<Integer> alter,
		MayBe<Double> gehalt, MayBe<GregorianCalendar> gebDatum) {
	super();
	this.vorname = vorname;
	this.nachname = nachname;
	this.email = email;
	this.bezStatus = bezStatus;
	this.alter = alter;
	this.gehalt = gehalt;
	this.gebDatum = gebDatum;
}


public void print()
{
System.out.println(vorname + " " + nachname);
System.out.print("Beziehungsstatus: ");
bezStatus.print();
System.out.print("Alter: ");
alter.print();
System.out.print("Gehalt: ");
gehalt.print();
System.out.print("Geburtsdatum: ");
gebDatum.print();
 	}


}