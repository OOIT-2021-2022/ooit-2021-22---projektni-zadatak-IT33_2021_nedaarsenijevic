package geometry;

public class point {

	private int x;
	private int y;
	private boolean selected;
	
	public double distance(int x2, int y2) {
		double dx = x - x2;
		double dy = y - y2;
		double d = Math.sqrt(dx*dx + dy*dy);
		return d;
	}
	//KONTSTRUKTORI, to su javne metode kod kojih nemamo ppratni tip i naziv metode je identican nazivu klase
	//Kreiramo ih za sve varijable koje imamo
	public point ( ) {
		//ovo je prazan default konstruktor
		//on se u pozadini moze pozivati sve dok se ne napise neki drugi koji nije prazan, mozemo koristiti iako ga nismo napisali
	}
	
	public point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public point(int x, int y, boolean selected) {
		//Ne pisemo ponovo this za x i this za y nego iskoristimo vec napisano da ne bismo dupirali kod na dva mesta
		this(x,y); //to pisemo na ovaj nacin
		this.selected = selected;
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
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	// public String toString() {
		
		 // return "(" + x + "," + " + y + ")"
	 //instanceof je operator koji nam omogucava proveru tipa kod objekta, tj da li je istanca neke klase
	public boolean equals (Object obj) { //proveravamo da li je obj instanca ove klase point
		if (obj instanceof point) { //ukoliko jeste kastujemo i pretvaramo u point
			point pomocna = (point) obj; //u zagradi je tip u koji zelimo da kastujemo a pored sta
			
			if(this.x == pomocna.getX() && this.y == pomocna.getY()) { //Poredi po vrednosti jer su oba int
				return true;
				
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
		
		
	}

