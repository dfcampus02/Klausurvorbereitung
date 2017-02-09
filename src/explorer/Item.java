package explorer;

public abstract class Item {
	private String name;

	public Item(String name) {
		super();
		this.name = name;
	}
	
	public  int getSize(int currentDeep)
	{
		return 6;
}

}
