package geometry;

public class test {

	public static void main(String[] args) {

		point p= new point ();
		p.setX(6);
		p.setY(5);
		p.setSelected(true);
		
		System.out.println("x coordinate: " + p.getX() + "Y coordinate: " + p.getY() + "Selected: " + p.isSelected());
 
		double result = p.distance(2, 2);
		System.out.println("Distance between points is: " + result);
		
		Line l1 = new Line();
		Rectengle r1=new Rectengle();
		point p1= new point();
		p1.setX(1);
		p1.setY(1);
		
		//1.Inicijalizovati x koordinatu tacke p na vrednost y koordinate tacke p1
		p.setX(p1.getY());
		System.out.println("Point p, x coordinate: " + p.getX());
		
		//2.Postaviti za pocetnu tacku linije l1 tacku p, a za krajnju tacku linije l1 tacku p1
		l1.setStartPoint(p);
		l1.setEndPoint(p1);
		System.out.println("Line l1 start point " + l1.getStartPoint().getX() + " , " + l1.getStartPoint().getY());
		
		
		
		//3.Postaviti y koordinatu krajnje tacke l1 na 23
		p1.setY(23);
		l1.setEndPoint(p1);
		l1.getEndPoint().setY(23);
	}
	
}
