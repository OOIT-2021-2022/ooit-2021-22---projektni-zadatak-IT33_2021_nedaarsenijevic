package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Point extends Shape {

	private int x;
	private int y;
	// private boolean selected; brisemo jer point vidi selcted iz shape
	
	public double distance(int x2, int y2) {
		double dx = x - x2;
		double dy = y - y2;
		double d = Math.sqrt(dx*dx + dy*dy);
		return d;
	}
	//METODE PRISTUPA
	
	
	//KONTSTRUKTORI, to su javne metode kod kojih nemamo ppratni tip i naziv metode je identican nazivu klase
	//Kreiramo ih za sve varijable koje imamo
	public Point ( ) {
		//ovo je prazan default konstruktor
		//on se u pozadini moze pozivati sve dok se ne napise neki drugi koji nije prazan, mozemo koristiti iako ga nismo napisali
	}
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	public Point(int x, int y, Color color) {
		this(x, y);
		this.color = color;
	}
	
	public Point(int x, int y, Color color, boolean selected) {
		
		this(x, y, color);
		this.selected = selected;
	}
	
	public boolean contains(int x, int y) {
		return this.distance(x, y) <= 2;

		/*
		 * if (this.distance(x, y) <= 2) return true; else return false;
		 */
	}
	
	public boolean contains(Point clickPoint) {
		return this.distance(clickPoint.x, clickPoint.getY()) <= 2;
	}

	 
	/*public boolean contains(int x, int y) {
		return (upperLeft.getX() <x && upperLeft.getX() + width > x && 
		 upperLeft.getY() > y ); }*/
	
	//metode pristupa
	//GET I SET METODE 
	//uvek public
	public int getX() {
		return x;
	}
	 
	//imaju ulazni parametar
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return this.y; //moze i bez this
	}
	public void setY(int y)  {
		this.y = y;
	}
	
	
	
	 //instanceof je operator koji nam omogucava proveru tipa kod objekta, tj da li je istanca neke klase
	public boolean equals (Object obj) { //proveravamo da li je obj instanca ove klase point
		if (obj instanceof Point) { //ukoliko jeste kastujemo i pretvaramo u point
			Point pomocna = (Point) obj; //u zagradi je tip u koji zelimo da kastujemo a pored sta
			
			if(this.x == pomocna.getX() && this.y == pomocna.getY()) { //Poredi po vrednosti jer su oba int
				return true;
				
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(this.color);
		g.drawLine(x-2, y, x+2, y); //horizontalna linija
		g.drawLine(x, y-2, x, y+2); //vertikalna linija

		if (isSelected()) {
			g.setColor(color.BLUE);
			g.drawRect(x - 2, y - 2, 4, 4);
			g.setColor(Color.black);
		}
	}
	@Override
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void moveBy(int byX, int byY) {
		this.x = this.x + byX;
		this.y += byY;
	}

	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Point) {
			Point shapeToCompare = (Point) obj;
			return (int) (this.distance(0, 0) - shapeToCompare.distance(0, 0));
		}
		return 0;
	}
}

