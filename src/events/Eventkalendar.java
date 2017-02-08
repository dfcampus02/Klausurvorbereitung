package events;

import java.util.ArrayList;
import java.util.HashMap;

public class Eventkalendar {
private ArrayList<Event> events = new ArrayList<>();
	
	public void add(Event evt) {
		events.add(evt);
	}
	
	public Event getByTitle(String title) {
		for(Event e : events) {
			if(e.getTitle().equals(title)) {
				return e;
			}
		}
		return null;
	}
	
	public ArrayList<Event> getByOrt(String ort) {
		ArrayList<Event> found = new ArrayList<>();
		for(Event e : events) {
			if(e.getOrt().equals(ort)) {
				found.add(e);
			}
		}
		return found;
	}
	
	public ArrayList<Event> getByEintrittspreis(double min,double max) {
		ArrayList<Event> found = new ArrayList<>();
		for(Event e : events) {
			if(e.getEintrittspreis() >= min 
					&& e.getEintrittspreis() <= max) {
				found.add(e);
			}
		}
		return found;
	}
	
	public Event getMostExpensiveByOrt(String ort) {
		double maxPreis = 0.0;
		Event found = null;
		for(Event e : events) {
			if(e.getEintrittspreis() > maxPreis
					&& e.getOrt().equals(ort)) {
				maxPreis = e.getEintrittspreis();
				found = e;
			}
		}
		return found;
	}
	
	public double getAvgPreisByOrt(String ort) {
		double total = 0.0;
		int counter = 0;
		for(Event e : events) {
			if(e.getOrt().equals(ort)) {
				total += e.getEintrittspreis();
				counter++;
			}
		}
		
		if(counter > 0)
			return total/counter;
		
		return -1;
	}
	
	public HashMap<String,Integer> getCountByOrt() {
		HashMap<String,Integer> groupByOrt = new HashMap<>();
		for(Event e : events) {
			Integer value = groupByOrt.get(e.getOrt());
		
			if(value != null) {
				groupByOrt.put(e.getOrt(), value+1);
			
			} else {
				groupByOrt.put(e.getOrt(),1);
			}
		}
		return groupByOrt;
}
}
