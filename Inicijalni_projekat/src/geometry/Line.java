package geometry;

public class Line {
	
	private point startPoint;
	private point endPoint;
	private boolean selected;
	
	//Metoda za izracunavanje duzine linije
	public double length() {
	}
	
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
	

}
