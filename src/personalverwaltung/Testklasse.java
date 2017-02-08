package personalverwaltung;

public class Testklasse {

	public static void main(String[] args) {
		System.out.println(fakultaet(5));

	}
	
	public static int fakultaet(int i){
		int v=0;
		if (i<1)
			return 1;
		System.out.println(v);
	v=i*fakultaet(i-1);
	System.out.println(v);
		return v;
	
	}

}
