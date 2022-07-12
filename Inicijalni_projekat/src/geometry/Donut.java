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
	
	public Donut (Point center, int radius, int innerRadius, boolean selected) {
		this(center, radius, innerRadius);
		setSelected(selected); //moramo ovako jer ne postoji konstruktor koji bi setovao samo selected
	}
	
	public Donut(Point point, int outerRadius, int innerRadius2, Color edgeColor, Color fillColor) {
		// TODO Auto-generated constructor stub
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
	
	public String toString() {
		return super.toString() + " , innerRadius: " + innerRadius;
	}
	
	public void draw(Graphics g) {
		super.draw(g); //spoljasnji krug
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
	
	public int compareTo(Object obj) {
		if (obj instanceof Donut) {
			return (int) (this.area() - ((Donut) obj).area());
		}
		return 0;
	}


	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}

}

//protective dozvoljava pristup u okviru istog paketa tako da je center moglo umesto private protected
//i onda moze prkeo this
//SUPER GLEDA UVEK JENDU KLASU IZNAD DOK THIS TU KLASU U KOJOJ PISEMO