package geometry;

import java.awt.Graphics;

public abstract class Shape { //moramo oznaciti da je abstract klasa
	
	private boolean selected; 
	
	public abstract boolean contains (int x, int y); //potpis metode samo i zato je ; apstraktna metoda
	public abstract void draw(Graphics g);

	//Automatsko krekiranje get i set desni kli source i uvek na kraju dodati
	//Isto tako i za konstruktore
	
    public Shape () {
		
	}
	
	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	
	public Shape(boolean selected) {
		super();
		this.selected = selected;
	}
	
	
	
	
	
	
	
}
//deklaracija samo navodimo da postoji metoda
//implementacija je logika te metode