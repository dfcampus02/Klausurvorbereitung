package explorer;

public class File extends Item {
	private int size;
	public File(String name, int size) {
		super(name);
		this.size = size;
	}
	
	@Override
	public int getSize(int currentDeep) {
		// TODO Auto-generated method stub
		return size  + super.getSize(currentDeep);
}

}
