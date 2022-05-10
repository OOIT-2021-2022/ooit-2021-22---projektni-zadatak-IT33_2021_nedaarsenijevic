package geometry;

public class Test {

	public static void main(String[] args) {

		Point p= new Point (); //poziv konstruktora bez parametra
		p.setX(6);
		p.setY(5);
		p.setSelected(true);
		
		System.out.println("x coordinate: " + p.getX() + "Y coordinate: " + p.getY() + "Selected: " + p.isSelected());
 
		double result = p.distance(2, 2);
		System.out.println("Distance between points is: " + result);
		
		Line l1 = new Line();
		Rectengle r1=new Rectengle();
		Point p1= new Point();
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
		
		
		
		Point p2 = new Point (50, 100);
		Line l2 = new Line (p2, new Point (400,500));
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
		
		System.out.println(p2 instanceof Point); //true
		//System.out.println(p2 instanceof Rectengle); //false
		System.out.println(p2 instanceof Object); //sve je instanca klase object
		
		//Sedme vezbe
		System.out.println("vezbe 7");
		System.out.println(p1);
		p1.moveBy(5, 3);
		System.out.println(p1);
		p1.moveTo(5, 3);
		System.out.println(p1);
		//napisati ostatak//
		
		int [] numbers = { 5, 4, 3, 2, 1 };
		System.out.println("Nesortiran niz");
		
		for(int i=0; i < numbers.length ; i++)  { 
			System.out.println(numbers[i]);
		}
		
		Arrays.sort(numbers); //sortiranje niza
		
		
	
		}
}
//OVERLOADING I OVERRIDE (nasledjivanje)
//NASLEDJIVANJE KLASE EXTENDS JE KLJUCNA REC!!
//SESTE VEZBE TEORIJA apsrakcijaa klasa
//interfejs je potpuna apstrakcija
//imamo i neapstraktne metode kao i apstraktne
//apstraktne metode su metode koje nemaju implementaciju vec imamo samo njen potpis - za ispit
//apstraktne metode nemaju telo {}
//apstraktne klase ne mogu biti istancirane ali imaju konstruktore kako bi inicijalizovale vrednosti izvedenih klasa
//KOLEKCIJE , nizovi
//definisanu duzinu ne mozemo da promenimo
//