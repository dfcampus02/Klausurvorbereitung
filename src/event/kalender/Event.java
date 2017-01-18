package event.kalender;

public class Event {
	private String title;
	private String ort;
	private double preis;
	public String getTitle() {
		return title;
	}
	public String getOrt() {
		return ort;
	}
	public double getPreis() {
		return preis;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	@Override
	public String toString() {
		return "Event [title=" + title + ", ort=" + ort + ", preis=" + preis + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ort == null) ? 0 : ort.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preis);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (ort == null) {
			if (other.ort != null)
				return false;
		} else if (!ort.equals(other.ort))
			return false;
		if (Double.doubleToLongBits(preis) != Double.doubleToLongBits(other.preis))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	

}
