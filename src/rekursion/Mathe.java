package rekursion;

public class Mathe {

	
		public static int sum(int n) {
			if(n == 0) {
				return 0;
			}
			//System.out.println(n);
			return n + sum(n-1);
		}
		
		public static int fibonacci(int n) {
			if(n <= 2) {
				return 1;
			}
			
			return fibonacci(n-2) + fibonacci(n-1);
		}
		
		
		public static int  factorial(int n) {
			if(n <= 1) {
				return 1;
			}
			return n * factorial(n-1);
	}

	}


