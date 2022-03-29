package geometry;

public class Circle {
	private point center;
	private int radius;
	private boolean selected;
	
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
	
}




 
