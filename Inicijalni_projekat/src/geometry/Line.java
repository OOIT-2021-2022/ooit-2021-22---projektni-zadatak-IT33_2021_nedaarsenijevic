package geometry;

public class Line {
	
	private point startPoint;
	private point endPoint;
	private boolean selected;
	
	
	//Konstruktori
	
	public Line() {
		
	}
	
	public Line (point startPoint, point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		
	}
	
	public Line (point startPoint, point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}
	
	
	
	//Metoda za izracunavanje duzine linije
	//public double length() { zakomentarisano je jer treba da se zavrsi do kraja
	
	
	//Metode pristupa
	public point getStartPoint() {
		return startPoint;
		
	}
	
	public void setStartPoint(point startPoint) {
		this.startPoint = startPoint;
	}
	
	public point getEndPoint() {
		return endPoint;
	}
	
	public void setEndPoint(point endPoint) {
		this.endPoint = endPoint;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected=selected;
	}
	
	
	public boolean equals(Object obj) {
		if (obj instanceof Line) {
			 
			Line pomocna = (Line) obj;
			if (this.startPoint.equals(pomocna.startPoint) && this.endPoint.equals(pomocna.endPoint)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public String toString ( ) {
		return startPoint + "--->" + endPoint;
		
	}
	

	

}
