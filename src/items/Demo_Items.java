package items;

public class Demo_Items {

	public static void main(String[] args) {
		
		Rectangle a=new Rectangle(10.0, 10.0);
		Rectangle b=new Rectangle(100.0, 10.0);
		Rectangle c=new Rectangle(200.0, 100.0);
		Circle d= new Circle(2.0);
		FigureManager figures= new FigureManager();
		figures.addFigure(a);
		figures.addFigure(b);
		figures.addFigure(c);
		figures.addFigure(d);
		figures.addFigure(a);
		figures.addFigure(b);
		figures.addFigure(c);
		
		System.out.println(figures.getMaxPerimeter());
		System.out.println("+++++++++++++++++++++");
		System.out.println(figures.getAverageAreaSize());
		System.out.println("+++++++++++++++++++++");
		System.out.println(figures.getAreaBySizeCategories());
	}

}
