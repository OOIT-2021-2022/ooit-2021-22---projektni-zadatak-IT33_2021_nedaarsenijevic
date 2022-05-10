package geometry;

public abstract class Line extends Shape {
	
	private Point startPoint;
	private Point endPoint;
	
	
	
	//Konstruktori
	
	public Line() {
		
	}
	
	public Line (Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		
	}
	
	public Line (Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		setSelected(selected);
	}
	
	
	
	//Metoda za izracunavanje duzine linije
	//public double length() { zakomentarisano je jer treba da se zavrsi do kraja
	
	
	//Metode pristupa
	public Point getStartPoint() {
		return startPoint;
		
	}
	
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	
	public Point getEndPoint() {
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

	public int compareTo(Object obj) { //ovo uradimo za sve klase
		if (obj instanceof Line) {
			return (int) this.lenght() - ((Line) obj).lenght());
		}
	}

}
