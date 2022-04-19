package geometry;

public class Line extends Shape {
	
	private point startPoint;
	private point endPoint;
	
	
	
	//Konstruktori
	
	public Line() {
		
	}
	
	public Line (point startPoint, point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		
	}
	
	public Line (point startPoint, point endPoint, boolean selected) {
		this(startPoint, endPoint);
		setSelected(selected);
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
	
	public void draw(Graphich g) {
		g.drawLine(startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());
	}

	

}
