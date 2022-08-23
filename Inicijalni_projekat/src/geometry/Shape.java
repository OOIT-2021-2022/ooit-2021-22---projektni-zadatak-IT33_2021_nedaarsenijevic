package geometry;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements Moveable, Comparable { //moramo oznaciti da je abstract klasa
	protected boolean selected;
	protected Color color;
	
	public abstract boolean contains (int x, int y); //potpis metode samo i zato je ; apstraktna metoda
	public abstract void draw(Graphics g);

	//Automatsko krekiranje get i set desni kli source i uvek na kraju dodati
	//Isto tako i za konstruktore
	
	public Shape() {

	}

	public Shape(boolean selected) {
		this.selected = selected;
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Shape(Color color, boolean selected) {
		this(color);
		this.selected = selected;
	}
	

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
	
	
	
	
}
//deklaracija samo navodimo da postoji metoda
//implementacija je logika te metode