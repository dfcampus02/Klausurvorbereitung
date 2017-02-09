package uebungsbeispiele_LV11_OOP;

public class Animals {
protected String color;
protected int countEyes;

public Animals(String color) {
	super();
	this.color = color;
	countEyes=2;
}
public void walk(){
}
public void makeNoise(){
}
public String getColor() {
	return color;
}
public int getCountEyes() {
	return countEyes;
}

}

