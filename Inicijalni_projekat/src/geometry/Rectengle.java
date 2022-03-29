package geometry;

public class Rectengle {
	
	private point upperLeft;
	private int width;
	private int height;
	private boolean selected;
	
	//Konstruktori
	
	public Rectengle () {
		
	}
	

	
	public Rectengle (point upperLeft, int width, int height) {
		this.upperLeft = upperLeft;
		this.width = width;
		this.height = height;
	}
	
	public Rectengle (point upperLeft, int width, int height, boolean selected) {
		this(upperLeft, width, height );
		this.selected = selected;
	}
	
	//Povrsina pravougaonika
	public int area() {
		return width * height;
	}
	
	//Obim pravougaonika
	public int circuference() {
		return 2*width + 2*height;
	}
	
	//Metode pristupa
	public point getUpperLeft() {
		return upperLeft;
	}
	 // public void setUpperLeft(point upperLeft) {
		//this.upperLeft = upper.Left;
		
	//}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth (int width) {
		this.width=width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	public boolean isSelected () {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected=selected;
	}
	
	public String toString () {
		
		return "upper Left point: " + upperLeft + " ,width " + width + ",height" + height;
		
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Rectengle) {
			Rectengle pomocna = (Rectegnle) obj;
			if (this.upperLeft.equals(pomocna.upperLeft()) && this.width == pomocna.width && this.height == pomocna.height) { //ovde smo uporedili tacke
				return true;
			} else {
				return false;
			}
			}
	}
	

}


//FINAL / za isppit /
// 4 zadatak za domaci
//kako postaviti na github






