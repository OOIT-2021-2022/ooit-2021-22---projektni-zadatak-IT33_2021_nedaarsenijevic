package geometry;

import java.awt.Graphics;
import java.awt.Point;

public class Rectengle extends Shape {
	
	private point upperLeft;
	private int width;
	private int height;

	
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
		setSelected(selected);
	}
	
	public boolean contains(int x, int y) {
		return (upperLeft.getX() <x && upper.Left.getX() + width > x && upper.Left.getY() > y );
	}
	
	public boolean contains(Point p) {
		return (upperLeft.getX() < p.getX() && upperLeft.getX() + width > p.getX()
				&& upperLeft.getY < p.getY() && upperLeft.getY() + height > p.getY());
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
	
	
	
	public String toString () {
		
		return "upper Left point: " + upperLeft + " ,width " + width + ",height" + height;
		
	}



	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawRect(upperLeft.getX(), upperLeft.getY(), width, height);
		
	}
	
	//public boolean equals(Object obj) { ovo zavrsiti
		//if (obj instanceof Rectengle) {
			//Rectengle pomocna = (Rectegnle) obj;
			//if (this.upperLeft.equals(pomocna.upperLeft()) && this.width == pomocna.width && this.height == pomocna.height) { //ovde smo uporedili tacke
				//return true;
			//} else {
				//return false;
			//}
			//}
	//}
	

}


//FINAL / za isppit /
// 4 zadatak za domaci
//kako postaviti na github

//zavrsiti contains za sve klase
//2zadatak overloading




