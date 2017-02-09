package items;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
	
	private ArrayList<Figure> figures = new ArrayList<>();
	
	public void addFigure(Figure f){
		figures.add(f);
	}
	
	public double getMaxPerimeter(){
		double max=0.0;
		for (Figure figure : figures) {
			if (figure.getPerimeter()>max)
				max=figure.getPerimeter();
			
		}
		
		return max;
	}
	public double getAverageAreaSize(){
		int count=0;
		double avg=0.0;
		for (Figure figure : figures) {
			
				avg+=figure.getArea();
			count++;
		}
		
		return avg/count*1.0;
	}
	
	
		public HashMap<String,Double> getAreaBySizeCategories(){
			HashMap<String,Double> ergebnis= new HashMap<>();
			ergebnis.put("klein", 0.0);
			ergebnis.put("mittel", 0.0);
			ergebnis.put("groß", 0.0);
			
			for (Figure figure: figures){
				double area= figure.getArea();
				if(area<1000){
					ergebnis.put("klein", ergebnis.get("klein")+area);
				}
				if(area<=4999){
					ergebnis.put("mittel", ergebnis.get("mittel")+area);
				}
				else
					ergebnis.put("groß", ergebnis.get("groß")+area);
				}
			
			
			
			
			return ergebnis;
		}

//		@Override
//		public String toString() {
//			return "FigureManager [figures=" + figures + "]";
//		}

}
