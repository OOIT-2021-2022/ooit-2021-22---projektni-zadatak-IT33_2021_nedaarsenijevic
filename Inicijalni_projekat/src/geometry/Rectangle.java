package geometry;


import java.awt.Color;
import java.awt.Graphics;


public class Rectangle extends ShapeSurface {
	
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
	
	public Rectangle(Point upperLeftPoint, int width, int height, Color edgeColor, Color fillColor) {
		this(upperLeftPoint, width, height);
		this.color = edgeColor;
		this.fillColor = fillColor;
	}
	
	public Rectangle(Point upperLeftPoint, int width, int height, Color edgeColor, Color fillColor, boolean selected) {
		this(upperLeftPoint, width, height, edgeColor, fillColor);
		this.selected = selected;
	}
	
	public boolean contains(int x, int y) {
		return (upperLeft.getX() <x && upperLeft.getX() + width > x && 
		 upperLeft.getY() > y ); }
	
	//public boolean contains(int x, int y) {
		//return x >= upperLeftPoint.getX() && x <= this.upperLeftPoint.getX() + width && y >= upperLeftPoint.getY()
			//	&& y <= getUpperLeftPoint().getY() + height; }
	
	public boolean contains(Point clickPoint) {
		return clickPoint.getX() >= upperLeft.getX() && clickPoint.getX() <= this.upperLeft.getX() + width
				&& clickPoint.getY() >= upperLeft.getY()
				&& clickPoint.getY() <= getUpperLeft().getY() + getHeight();
	}

	
   public Rectangle (Point upperLeft, int width, int height, boolean selected) {
		this(upperLeft, width, height );
		setSelected(selected);
	} //proveri
   

	
	//Povrsina pravougaonika
	public int area() {
		return width * height;
	}
	
	public int circumference() {
		return 2 * (width + height);
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
	
	
	public String toString() {
		return "Upper left point:" + upperLeft + ", width =" + width + ",height = " + height;
	}

	
	@Override
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.drawRect(upperLeft.getX(), upperLeft.getY(), width, height);
		this.fill(g);
		if (isSelected()) {
			g.setColor(Color.blue);
			g.drawRect(upperLeft.getX() - 2, upperLeft.getY() - 2, 4, 4);
			g.drawRect(upperLeft.getX() + width - 2, upperLeft.getY() - 2, 4, 4);
			g.drawRect(upperLeft.getX() - 2, upperLeft.getY() + height - 2, 4, 4);
			g.drawRect(upperLeft.getX() + width - 2, upperLeft.getY() + height - 2, 4, 4);
			g.setColor(Color.black);
		}
	}
	
	

	@Override
	public void moveTo(int x, int y) {
		upperLeft.moveTo(x, y);
	}
	
	@Override
	public void moveBy(int byX, int byY) {
		upperLeft.moveBy(byX, byY);
	}
	
	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle shapeToCompare = (Rectangle) obj;
			return this.area() - shapeToCompare.area();
		}
		return 0;
	}

	@Override
	public void fill(Graphics g) {
		g.setColor(fillColor);
		g.fillRect(this.upperLeft.getX() + 1, this.upperLeft.getY() + 1, this.width - 1, this.height - 1);
	
		
	}
	
	
}







