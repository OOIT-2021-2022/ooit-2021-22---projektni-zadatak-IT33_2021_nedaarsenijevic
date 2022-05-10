package geometry;

import java.awt.Graphics;

public abstract class Point extends Shape {

	private int x;
	private int y;
	// private boolean selected; brisemo jer point vidi selcted iz shape
	
	public double distance(int x2, int y2) {
		double dx = x - x2;
		double dy = y - y2;
		double d = Math.sqrt(dx*dx + dy*dy);
		return d;
	}
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
	
	public Point(int x, int y, boolean selected) {
		//Ne pisemo ponovo this za x i this za y nego iskoristimo vec napisano da ne bismo dupirali kod na dva mesta
		this(x,y); //to pisemo na ovaj nacin
		//this.selected = selected; brisemo jer smo obrisali varijablu
		setSelected(selected);
	}
	
	
	
	
	
	
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
		return this.y; //moze i bez return
	}
	public void setY(int y)  {
		this.y = y;
	}
	
	
	
	// public String toString() {
		
		 // return "(" + x + "," + " + y + ")"
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
	@Override
	public boolean contains(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawLine(x-2, y, x+2, y); //horizontalna linija
		g.drawLine(x, y-2, x, y+2); //vertikalna linija
	}
	public void moveTo(int i, int j) {
		// TODO Auto-generated method stub

		}
	
	public void moveBy(int i, int j) {
		// TODO Auto-generated method stub

		}
		
	public int compareTo(Object obj) {
		if (obj instanceof Point) {
			return (int) (this.distance(0, 0) - ((Point) obj).distance(0, 0));
		}
		return 0;
	}
		
	}

