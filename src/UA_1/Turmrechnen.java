package UA_1;

public class Turmrechnen {

	public static void main(String[] args) {
	//whileSchleife(2,2);
	forSchleife(2);
	}
	
		
public static void whileSchleife(int num, int count){
		while(count<10){
			System.out.println(num+ "*"+count + "= " + num*count);
			num*=count++;
			//counter++;
			}
		count=2;
		while(count<10){
			System.out.println(num+ "/"+count + "= " + num/count);
			num/=count++;
			//counter--;	
		}

	}

public static void forSchleife(int num){
	for (int count=2; count<10; count++){
		System.out.println(num+ "*"+count + "= " + num*count);
		num*=count;
	}
	for (int count=2; count<10; count++){
		System.out.println(num+ "/"+count + "= " + num/count);
		num/=count;
	}
}
}

