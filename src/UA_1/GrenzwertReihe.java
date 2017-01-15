package UA_1;

public class GrenzwertReihe {

	public static void main(String[] args) {
		System.out.println(berechneGrenzwert(0.001));

	}
	public static double berechneGrenzwert(double genauigkeit){
		double vWert = 0.0;
		double aWert = 0.0;

		for (int i = 1;; i *= 2) {
			aWert += (1.0 / i);
			if (aWert - vWert < genauigkeit) {
				break;
			}
			vWert = aWert;
		}

		return aWert;
	}
	}


