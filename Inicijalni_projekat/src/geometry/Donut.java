package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Donut extends Circle { //extends je kljucna rec jer nasledjuje iz klase circle
	
	private int innerRadius;
	
	public Donut ( ) {
		
	}
	
	
	public Donut (Point center, int radius, int innerRadius) {
		super(center, radius); //koristimo umesto set da ne gomilamo kod
		//setCenter(center); //moramo prek set jer je center private, da je public moze this
		//setRadius (radius);
		this.innerRadius = innerRadius; 
		
	}
	
	public Donut(Point center, int radius, int innerRadius, Color edgeColor, Color fillColor) {
		this(center, radius, innerRadius);
		this.color = edgeColor;
		this.fillColor = fillColor;
	}
	
	public Donut(Point center, int radius, int innerRadius, Color edgeColor, Color fillColor, boolean selected) {
		/*
		 * this.innerRadius = innerRadius; this.center = center; //protected pa moze
		 * ovako setRadius(radius); //ovo smo ostavili private setSelected(selected);
		 */

		// drugi nacin
		// prva naredba!!
		this(center, radius, innerRadius, edgeColor, fillColor);
		this.selected = selected;
	}


	//REDEFINISANJE
	public double area() { //od povrsine velikog kruga smo oduzeli povrsinu malog kruga kako bismo dobili prsten i njegovu povrsinu
		return super.area() - innerRadius * innerRadius * Math.PI; 
	}
	
	public boolean contains(int x, int y) {
		return (super.contains(x, y) && getCenter().distance(x, y) >= innerRadius);
	}
	
	public boolean contains(Point clickPoint) {
		return super.contains(clickPoint) && getCenter().distance(clickPoint.getX(), clickPoint.getY()) >= innerRadius;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Donut) {
			Donut pomocni = (Donut) obj;
			if (pomocni.getCenter().equals(getCenter()) && 
				pomocni.getRadius() == getRadius() &&
				pomocni.innerRadius == innerRadius)
				return true;
		}
		return false;
	}
	
	//Metode pristupa
	public void  setInnerRadius(int innerRadius ) {
		this.innerRadius = innerRadius;
	}
	
	public int getInnerRadius ( ) {
		return innerRadius;
	}
	
	public String toString() {
		return super.toString() + " , innerRadius: " + innerRadius;
	}
	
	public void draw(Graphics g) {
		super.draw(g); //spoljasnji krug
		this.fill(g);
		g.setColor(Color.BLACK);
		g.drawOval(getCenter().getX() - innerRadius, getCenter().getY() - innerRadius, innerRadius*2, innerRadius*2);
		//unutrasnji krug
		
		if(isSelected()) {
			g.setColor(Color.BLUE);
			g.drawRect(getCenter().getX() - innerRadius -2, getCenter().getY()-2, 4, 4);
			g.drawRect(getCenter().getX() + innerRadius -2, getCenter().getY()-2, 4, 4);
			g.drawRect(getCenter().getX() -2, getCenter().getY()- innerRadius-2, 4, 4);
			g.drawRect(getCenter().getX() -2, getCenter().getY()+ innerRadius-2, 4, 4);
		}
	}
	
	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Donut) {
			Donut shapeToCompare = (Donut) obj;
			return (int) (this.area() - shapeToCompare.area());
		}
		return 0;
	}

	
	public void fill(Graphics g) {
		g.setColor(this.fillColor);
		super.fill(g);
		g.setColor(Color.WHITE);
		g.fillOval(getCenter().getX() - this.innerRadius, getCenter().getY() - this.innerRadius, this.innerRadius * 2,
				this.innerRadius * 2);
	}


}

//protective dozvoljava pristup u okviru istog paketa tako da je center moglo umesto private protected
//i onda moze prkeo this
//SUPER GLEDA UVEK JENDU KLASU IZNAD DOK THIS TU KLASU U KOJOJ PISEMO