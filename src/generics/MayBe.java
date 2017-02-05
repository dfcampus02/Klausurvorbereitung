package generics;

public class MayBe<T> {
	private int status;
	private T data;
	
	
	public MayBe(int status, T data) {
		super();
		this.status = status;
		this.data = data;
	}


	public int getStatus() {
		return status;
	}


	public T getData() {
		return data;
	}


	public void setStatus(int status) {
		
		if (status >= 1 && status <=3)
		this.status = status;
		else
			System.out.println("ungültiger Status");
	}


	public void setData(T data) {
		this.data = data;
	}
	
	public void print(){
		
		switch(status){
		
		case 1:
			System.out.println("Zugriff gestattet: " + data);
			break;
		case 2:
			System.out.println("Zugriff verweigert");
			break;
		case 3:
			System.out.println("Nicht erfasst");
			break;
		default:
			System.out.println("Ungültiger Status");
			break;
		}

		}
	}
	
	
	

