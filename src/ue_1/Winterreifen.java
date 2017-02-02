package ue_1;

public class Winterreifen {

	public static void main(String[] args) {
		
//		int temp;
//		boolean rutschig;
		
		isWinterreifenPflicht (2, false);
		
	}
		public static boolean isWinterreifenPflicht (int temp, boolean rutschigeFahrbahn){
			if ((temp<10 && rutschigeFahrbahn==true) || temp<4){
				System.out.println("Winterreifen erforderlich");
				return true;
			}
			else 
				System.out.println("Winterreifen nicht erforderlich");
				return false;
		}

	}


