package geometry;

import java.awt.Graphics;
import java.awt.Point;

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
	
	public Donut (Point center, int radius, int innerRadius, boolean selected) {
		this(center, radius, innerRadius);
		setSelected(selected); //moramo ovako jer ne postoji konstruktor koji bi setovao samo selected
	}
	
	//REDEFINISANJE
	public double area() { //od povrsine velikog kruga smo oduzeli povrsinu malog kruga kako bismo dobili prsten i njegovu povrsinu
		return super.area() - innerRadius * innerRadius * Math.PI; 
	}
	
	public boolean contains(int x, int y) {
		return (super.contains(x, y) && getCenter().distance(x, y) >= innerRadius);
	}
	
	@Override
	public boolean contains(Point p) {
		return super.contains(p) && getCenter().distance(p.getX(), p.getY()) >= innerRadius;
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
	
	public void draw(Graphics g) {
		super.draw(g); //spoljasnji krug
		g.drawOval(getCenter().getX() - innerRadius, getCenter().getY() - innerRadius, innerRadius*2, innerRadius*2);
		//unutrasnji krug
		
		if (isSlected()) {
			g.setColor(Color.BLUE);
			g.drawRect(getcenter.getX() - innerRadius - 2, center.getY() - 2, 4, 4);
			g.drawRect(getcenter.getX() + innerRadius, center.getY() - 2, 4, 4);
			g.drawRect(getcenter.getX() - 2, center.getY() - innerRadius - 2, 4, 4);
			g.drawRect(getcenter.getX() - 2, center.getY() - innerRadius - 2, 4, 4);
		}
	}
	//1.REDEFINISATI OVERRIDE METODE IZ KLASE CIRCLE

}

//protective dozvoljava pristup u okviru istog paketa tako da je center moglo umesto private protected
//i onda moze prkeo this
//SUPER GLEDA UVEK JENDU KLASU IZNAD DOK THIS TU KLASU U KOJOJ PISEMO