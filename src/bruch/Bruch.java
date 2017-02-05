package bruch;

public class Bruch {

	private int zaehler;
	private int nenner;
	
	public double toDecimal(){
		double wert = zaehler*1.0/nenner;
		return wert;
		
	}
	
	public void print(){
		System.out.println(zaehler+ "/"+nenner);
	}
	
	public Bruch multiplicate(Bruch b2){
		int zaehler=b2.getZaehler();
		int nenner=b2.getNenner();
		
		return new Bruch (this.zaehler*=b2.getZaehler(), this.nenner*b2.getNenner());
	}
	
	public Bruch multiplicate(Bruch b2, Bruch b3){
		return new Bruch(this.zaehler * b2.getZaehler()* b3.getZaehler(), 
				this.nenner * b2.getNenner()* b3.getNenner());
	}
	
	
	public Bruch(int zaehler, int nenner) {
		super();
		this.zaehler = zaehler;
		this.nenner = nenner;
	}


	public int getZaehler() {
		return zaehler;
	}


	public int getNenner() {
		return nenner;
	}
	
	
	
}
