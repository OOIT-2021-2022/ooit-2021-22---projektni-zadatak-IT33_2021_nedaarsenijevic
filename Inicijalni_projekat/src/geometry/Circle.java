package geometry;

public class Circle {
	private point center;
	private int radius;
	private boolean selected;
	
	//Konstruktori , treba da imamo tri konstruktora!! TO ZAVRSITI
	public Circle () {
		
	}
	
	public Circle (point center, int radius) {
		this.center= center;
	}
	
	public boolean contains (int x, int y) {
		
	}
	
	
	//OVERLOADING
	
	public boolean contains ( int x, int y) {
		return center.distance( x, y) <= radius;
	}
	
	public boolean contains (Point p) {
		return center.distance()
	}

	//Povrsina kruga ovde povratni tip mora biti double ne moze int jer imamo PI
	public double area() {
		return radius*radius* Math.PI;
	}
	
	//Obim kruga ce takodje biti tipa double zbog PI
	public double circuference () {
		return 2*radius*Math.PI;
	}
	
	//Metode pristupa
	public point getCenter() {
		return center;
	}
	
	public void setCenter(point center) {
		this.center = center;
	}
	
	public int getRadius ( ) {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public boolean isSelected () {
		return selected;
		
	}
	
	public void setSelected (boolean selected) {
		this.selected = selected;
	}
	
	public String toString () {
		return "Center poi
	}
	
	public boolean equals(Object obj) { //radimo kastovanje
		if(obj) instanceof Circle {
		Circle  pomocni = (Circle) obj; //Proveravamo da li je instanca
	if(pomocni.getCenter()eguals(center) && pomocni.getRadius() == radius)
		return true;
	else false;
		}
		return false;
	}
}
 



 
