package UA_1;

public class WinterreifenpflichtDemo {

	public static void main(String[] args) {
		isWinterreifenPflicht(3, true);
		}
	
	public static boolean isWinterreifenPflicht (int temperatur,boolean rutschigeFahrbahn){
		if ((temperatur<10 && rutschigeFahrbahn==true) || temperatur<4){
			System.out.println("Bitte Winterreifen anlegen!");
			return true;}
		System.out.println("keine Winterreifen erforderlich!");
			return false;
		
		
	}
}
