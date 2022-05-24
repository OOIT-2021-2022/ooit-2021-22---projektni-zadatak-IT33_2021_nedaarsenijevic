package geometry;

public abstract class Line extends Shape {
	
	private Point startPoint;
	private Point endPoint;
<<<<<<< HEAD
=======
	private boolean selected;
>>>>>>> branch 'master' of https://github.com/OOIT-2021-2022/ooit-2021-22---projektni-zadatak-IT33_2021_nedaarsenijevic.git
	
	
	
	//Konstruktori
	
	public Line() {
		
	}
	
	public Line (Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		
	}
	
	public Line (Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
		setSelected(selected);
	}
	
	
	
	//Metoda za izracunavanje duzine linije
	
	public double length() {
		return startPoint.distance(endPoint.getX(), endPoint.getY());
	}
	
	public boolean contains(int x, int y) {
		return startPoint.distance(x, y) + endPoint.distance(x, y) - lenght() <= 2;
	}
	
	
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
	
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
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
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());
		
		if (isSelected()) {
			g.setColor(Color.BLUE);
			g.drawRect(startPoint.getX()-2, startPoint.getY()-2, 4, 4);
			g.drawRect(endPoint.getX()-2, endPoint.getY()-2, 4, 4);
		}

	}

	public int compareTo(Object obj) { //ovo uradimo za sve klase
		if (obj instanceof Line) {
			return (int) this.lenght() - ((Line) obj).lenght());
		}
	}

}
