package explorer;

import java.util.ArrayList;

public class Folder extends Item {
private ArrayList<Item> items = new ArrayList<>();
	
	public void add(Item i)
	{
		items.add(i);
	}
	
	public Folder(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public int getSize(int currentDeep) {
		
		if (currentDeep > 5)
			return 555;
		
		int size = super.getSize(currentDeep);
		
		for (Item item : items) {
			size += item.getSize(currentDeep +1);
		}
		
		return size;
}
}
