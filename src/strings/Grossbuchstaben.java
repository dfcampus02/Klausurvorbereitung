package strings;

public class Grossbuchstaben {

	public static void main(String[] args) {
		
		String text ="Wörter starten mit Grossbuchstaben";
		System.out.println(wordsStartingCapitalLetter(text));
	}
		public static String wordsStartingCapitalLetter(String s){
			String result = "";
			for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (i == 0 || s.charAt(i - 1) == ' ')
			c = Character.toUpperCase(c);
			
			result += c;
				
			}
			
			return result;
		}



}
