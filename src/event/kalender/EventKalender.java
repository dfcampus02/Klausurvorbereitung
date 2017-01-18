package event.kalender;
import java.util.ArrayList;

public class EventKalender {
	private ArrayList<Event> events = new ArrayList<>();

	public void add(Event event) {
		events.add(event);
	}

	public Event getByTitle(String title) {
		for (int i = 0; i < events.size(); i++) {
			if (events.get(i).getTitle().equals(title)) {
				return events.get(i);
			}
		}
		return null;
	}

	public ArrayList<Event> getByOrt(String ort) {
		ArrayList<Event> found = new ArrayList<>();
		for (Event e : events) {
			if (ort.equals(e.getOrt())) {
				found.add(e);
			}
		}
		return found;
	}

	public ArrayList<Event> getByPreis(double min, double max) {
		ArrayList<Event> found = new ArrayList<>();
		for (Event e : events) {
			if (min <= e.getPreis() && e.getPreis() <= max) {
				found.add(e);
			}
		}
		return found;
	}

	public Event getMostExpensiveByOrt(String ort) {
		double maxPreis = -1.0;
		Event found = null;
		for (Event e : events) {
			if (e.getPreis() > maxPreis) {
				found = e;
				maxPreis = e.getPreis();
			}
		}
		return found;
	}
	public double getAvgPreisByOrt(String ort) {
		double sum =0.0;
		int found =0;
		for (Event e: events){
			if(e.getOrt().equals(ort)){
				found++;
				sum +=e.getPreis();
			}
		}
		if(found>0){
			return sum/found;
		}
		return -1.0;
	}
}
