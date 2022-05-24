package geometry;

import java.awt.Graphics;

public class Circle extends Shape {
	private Point center;
	private int radius;
	private boolean selected;
	
	
	//Konstruktori , treba da imamo tri konstruktora!! Prvi konstruktor je prazan
	public Circle () {
		
	}
	
	public Circle (Point center, int radius) {
		this.center= center;
		this.radius= radius;
	}
	
	public Circle (Point center, int radius, boolean selected) {
		this(center,radius);
		this.selected = selected;
		setSelected(selected);
		
	}
	
	
	
	//OVERLOADING
	
	public boolean contains ( int x, int y) {
		return center.distance( x, y) <= radius;
	}
	
	public boolean contains (Point p) {
		return center.distance(p.getX(), p.getY()) <= radius;
	}

	//Povrsina kruga ovde povratni tip mora biti double ne moze int jer imamo PI
	public double area() {
		return radius*radius* Math.PI;
	}
	
	//Obim kruga ce takodje biti tipa double zbog PI
	public double circuference () {
		return 2*radius*Math.PI;
	}
	
	public boolean equals(Object obj) { //Radimo kastovanje
		if(obj instanceof Circle) {
			Circle pomocni = (Circle) obj; //Proveravamo da li je instanca
			if(pomocni.getCenter().equals(center) && pomocni.getRadius() == radius) 
				return true;
			return false;
		}
		return false;
		
	}
	//Metode pristupa
	public Point getCenter() {
		return center;
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public int getRadius ( ) {
		return radius;
	}
	
	public void setRadius(int radius) { throws Exception {
		if(radius < 0) ///if jer se ne misli na radius iy metode nego na prosledejeni
			throw new Exception("Radius ne moze biti manji od 0");
	}
		this.radius = radius;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public String toString () {
		return "Center point =" + "radius =" + radius;
	}
	
	
	
<<<<<<< HEAD
	//public boolean equals(Object obj) { //radimo kastovanje
		//if(obj) instanceof Circle {
		//Circle  pomocni = (Circle) obj; //Proveravamo da li je instanca
	//if(pomocni.getCenter()eguals(center) && pomocni.getRadius() == radius)
		//return true;
	//else false;
		//}
		//return false;
	//}
	
	

=======
>>>>>>> branch 'master' of https://github.com/OOIT-2021-2022/ooit-2021-22---projektni-zadatak-IT33_2021_nedaarsenijevic.git
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawOval(center.getX() - radius, center.getY() - radius, radius*2,  radius*2);
		
		if(isSelected()) {
			g.setColor(Color.BLUE);
			g.drawRect(center.getX() - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() - 2, center.getY() - radius - 2, 4, 4);
			g.drawRect(center.getX() - 2, center.getY()+ radius - 2, 4, 4);
			g.drawRect(center.getX() + radius - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() - radius - 2, center.getY() - 2, 4, 4);
			
		}
		
	}

}
 



 
