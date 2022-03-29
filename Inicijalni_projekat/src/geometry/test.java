package geometry;

public class test {

	public static void main(String[] args) {

		point p= new point (); //poziv konstruktora bez parametra
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
		
		
		
		point p2 = new point (50, 100);
		Line l2 = new Line (p2, new point (400,500));
		Rectengle r2 = new Rectengle (p1, 50, 80);
		
		System.out.println(p2);
		System.out.println(p1);
		System.out.println(l2);
		System.out.println(r2);
		System.out.println(p2.equals(p1));
		System.out.println(p2.equals(l2)); //ne mozemo poreditit tacku i liniju
		
		p1.setX(50);
		p1.setY(100);
		System.out.println(p2.equals(p1)); //sada dobijamo true jer imaju iste koordinate
		
		System.out.println(p2 instanceof point); //true
		System.out.println(p2 instanceof Rectengle); //false
		System.out.println(p2 instanceof Object); //sve je instanca klase object
		
		
	}
	
}
