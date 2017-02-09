package items;

public class Rectangle extends Figure {
	
	private double length;
	private double width;
	

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*length+2*width;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}

}
