package strings;

public class CSVDemo {

	public static void main(String[] args) {
		
		CSVParser text=new CSVParser("zeil e1,ze ile2,  ze ile3,");
		String[] parsedText= text.parse();
		
		String noBlanks= text.deleteBlanks();
		System.out.println(noBlanks);
			for (int i=0; i<parsedText.length; i++){
				System.out.println(parsedText[i]);
			}
			
			CSVParser pwd=new CSVParser("Programmieren EINS ist super");
			
			
			System.out.println(pwd.generatePassword());
		
			System.out.println(text.countNumbers());
			
			
		String a= "Das ist";
		String b="ein String";
		
		String c= a+b;
		String d=a.concat(b);
		System.out.println(c+d);
		}
		
	}


