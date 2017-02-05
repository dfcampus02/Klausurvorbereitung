package strings;

public class CSVParser {

	private String csvLine;

	public CSVParser(String csvline) {
		super();
		this.csvLine = csvline;
	}
	
	public int countComma(){
		int count=0;
		/*for (int i = 0; i < csvLine.length(); i++) {
		if (csvLine.charAt(i) == ',')
		{
			count++;
		}
	}*/
		char[] charArray = csvLine.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == ',')
				count++;
}
		return count;
	}
	
	public String deleteBlanks()
	{
		String returnValue = "";
		
		for (int i = 0; i < csvLine.length(); i++) {
			if (csvLine.charAt(i) != ' ')
				returnValue += csvLine.charAt(i);
		}
		
		return returnValue;
}
	
	
	
	public String [] parse(){
		String[] arr = new String[countComma()];
		int currentPosition = 0;
		String temp = "";
		
		for (int i = 0; i < csvLine.length(); i++) {			
			if (csvLine.charAt(i) == ',')
			{
				arr[currentPosition] = temp;
				temp = "";
				currentPosition++;
			}
			else
			{
				temp = temp + csvLine.charAt(i);
			}
		}		
	
return arr;
		
	}
	public String generatePassword()
	{
		String password = "";
		
		for (int i = 0; i < csvLine.length(); i++) {
			if (csvLine.charAt(i) == ' ')
			{	
				password += csvLine.charAt(i - 2);
				password += csvLine.charAt(i - 1);
			}
		}
		
		password += csvLine.charAt(csvLine.length() - 2);
		password += csvLine.charAt(csvLine.length() - 1);
		
		
		return password;
	}
	
	
	public int countNumbers()
	{
		int count = 0;

		for (int i = 0; i < csvLine.length(); i++) {
			switch (csvLine.charAt(i)) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				count++;
				break;
			default:
				break;
			}
		}
		
		return count;
}
}
