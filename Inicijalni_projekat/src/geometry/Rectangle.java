package geometry;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends Shape {
	
	private Point upperLeft;
	private int width;
	private int height;

	
	//Konstruktori
	
	public Rectangle () {
		
	}
	
	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	public Rectangle (Point upperLeft, int width, int height) {
		this.upperLeft = upperLeft;
		this.height = height;
		this.width = width;
	}
	
	public boolean contains(int x, int y) {
		return (upperLeft.getX() <x && upperLeft.getX() + width > x && 
		 upperLeft.getY() > y ); }
	
	public Rectangle (Point upperLeft, int width, int height, boolean selected) {
		this(upperLeft, width, height );
		setSelected(selected);
	}
	
	//public boolean contains(int x, int y) {
		 //return (upperLeft.getX() <x && upperLeft.getX() + width > x && upperLeft.getY() > y );
	//}
	
	public boolean contains(Point p) {
		return (upperLeft.getX() < p.getX() && upperLeft.getX() + width > p.getX()
				&& upperLeft.getY() < p.getY() && upperLeft.getY() + height > p.getY());
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
	public Point getUpperLeft() {
		return upperLeft;
	}
	
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}
	
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
	
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle pomocni = (Rectangle) obj;
			if (this.upperLeft.equals(pomocni.getUpperLeft()) && this.width == pomocni.width && this.height == pomocni.height) {
				return true;
			} else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	
	public String toString () {
		
		return "upper Left point: " + upperLeft + " ,width " + width + ",height" + height;
		
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.Rect(upperLeft.getX(), upperLeft.getY(), width, height);
		
		if(isSelected()) {
			g.setColor(Color.BLUE);
			g.Rect(upperLeft.getX()-2, upperLeft.getY()-2, 4, 4);
			g.Rect(upperLeft.getX()+ width -2, upperLeft.getY()-2, 4, 4);
			g.Rect(upperLeft.getX()-2, upperLeft.getY()+height-2, 4, 4);
			g.Rect(upperLeft.getX()+width-2, upperLeft.getY()+height-2, 4, 4);
		}
		
	}
	
	public void moveTo(int x, int y) {
		upperLeft.moveTo(x, y);
	}
	
	
	public void moveBy(int byX, int byY) {
		upperLeft.moveBy(byX, byY);
	}
	
	
	public int compareTo(Object o) {
		if (o instanceof Rectangle) {
			return (int) (this.area() - ((Rectangle) o).area());
		}
		return 0;
	}
	
}







