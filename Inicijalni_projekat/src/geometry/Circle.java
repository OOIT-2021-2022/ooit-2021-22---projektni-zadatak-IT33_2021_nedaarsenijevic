package geometry;

import java.awt.Graphics;

public class Circle extends Shape {
	private point center;
	private int radius;
	
	
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
	
	
	
	//**public String toString () {
		//return "Center poi
	//}
	
	//public boolean equals(Object obj) { //radimo kastovanje
		//if(obj) instanceof Circle {
		//Circle  pomocni = (Circle) obj; //Proveravamo da li je instanca
	//if(pomocni.getCenter()eguals(center) && pomocni.getRadius() == radius)
		//return true;
	//else false;
		//}
		//return false;
	//}
	
	

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawOval(center.getX() - radius, center.getY() - radius, radius*2,  radius*2);
		
	}
}
 



 
