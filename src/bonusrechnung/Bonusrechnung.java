package bonusrechnung;

public class Bonusrechnung {

	private String vorname;
	private String nachname;
	private int nummer;
	private double gehalt;
	private int alter;
	
	public double monatsAbrechnung(){
		
		gehalt = gehalt*12;
		gehalt*=0.8;
		System.out.println(gehalt);
		
		double bk1= 10000.0*0.9;
		double bk2= 10000.0*0.8;
		double bk3= 10000.0*68;
		double bk4= 10000.0*55;
		
		if (gehalt<=10000.0)
			gehalt*=0.9;
		
		else if (gehalt>10000.0 && gehalt<=20000.0)
			gehalt= (gehalt-10000.0)*0.8+bk1;
		
		else if (gehalt>20000.0 && gehalt<=30000.0)
			gehalt= (gehalt-20000.0)*0.68+bk1+bk2;
	//	System.out.println(gehalt);
		else if (gehalt>30000.0 && gehalt<=50000.0)
			gehalt= (gehalt-30000.0)*0.68+bk1+bk2+bk3;
		
		else if( gehalt > 50.000)
			gehalt=(gehalt-50000.0)*0.4+bk1+bk2+bk3+bk4;
			
		
		return gehalt/=12;
		
		
	}
public double jahresAbrechnung(){
		
		gehalt = gehalt*12;
		gehalt*=0.8;
		
		
		double bk1= 10000.0*0.9;
		double bk2= 10000.0*0.8;
		double bk3= 10000.0*68;
		double bk4= 10000.0*55;
		
		if (gehalt<=10000.0)
			gehalt*=0.9;
		
		else if (gehalt>10000.0 && gehalt<=20000.0)
			gehalt= (gehalt-10000.0)*0.8+bk1;
		
		else if (gehalt>20000.0 && gehalt<=30000.0)
			gehalt= (gehalt-20000.0)*0.68+bk1+bk2;
	//	System.out.println(gehalt);
		else if (gehalt>30000.0 && gehalt<=50000.0)
			gehalt= (gehalt-30000.0)*0.68+bk1+bk2+bk3;
		
		else if( gehalt > 50.000)
			gehalt=(gehalt-50000.0)*0.4+bk1+bk2+bk3+bk4;
			
		
		return gehalt;
		
		
	}
public double monatsAbrechnung(int monate){
	
	gehalt = gehalt*monate;
	gehalt*=0.8;
	System.out.println(gehalt);
	
	double bk1= 10000.0*0.9;
	double bk2= 10000.0*0.8;
	double bk3= 10000.0*68;
	double bk4= 10000.0*55;
	
	if (gehalt<=10000.0)
		gehalt*=0.9;
	
	else if (gehalt>10000.0 && gehalt<=20000.0)
		gehalt= (gehalt-10000.0)*0.8+bk1;
	
	else if (gehalt>20000.0 && gehalt<=30000.0)
		gehalt= (gehalt-20000.0)*0.68+bk1+bk2;
//	System.out.println(gehalt);
	else if (gehalt>30000.0 && gehalt<=50000.0)
		gehalt= (gehalt-30000.0)*0.68+bk1+bk2+bk3;
	
	else if( gehalt > 50.000)
		gehalt=(gehalt-50000.0)*0.4+bk1+bk2+bk3+bk4;
		
	
	return gehalt/=monate;
	
	
}
	public void printEmployee(){
		System.out.println(getVorname()+ " "+ getNachname()+ " "+ gehalt);
	}
	public Bonusrechnung(String vorname, String nachname, double gehalt) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.gehalt = gehalt;
	}
	
	
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}



	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}



	public String getVorname() {
		return vorname;
	}



	public String getNachname() {
		return nachname;
	}



	public int getNummer() {
		return nummer;
	}



	public double getGehalt() {
		return gehalt;
	}



	public int getAlter() {
		return alter;
	}

	
	
	
}
