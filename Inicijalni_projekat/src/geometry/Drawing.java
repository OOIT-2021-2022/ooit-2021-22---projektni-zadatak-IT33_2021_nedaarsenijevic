package geometry;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = newJFrame("Drawing");
		frame.setSize(800, 600);
		Drawing drawing = new Drawing();
		frame.getContentPane().add(drawing);
		frame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		point p1 = new point (50,50);
		p1.draw(g);
		

		
		g.setColor(Color.RED);
<<<<<<< HEAD
		Line l1 = new Line(new point(100,100), new point (200,200));
		l1.draw(g);
		g.setColor(Color.GREEN);
		l1.getStartPoint().draw(g);
		
		Circle c1 = new Circle(new Point(500,100), 80);
		c1.draw(g);
		c1.getCenter().draw(g);
		
		g.setColor(Color.black);
		Rectangle r1 = new Rectangle(l1.getEndPoint(), 100.50);
		r1.draw(g);
		
		Donut d1 = new Donut(new Point(800,100), 50, 25);
		d1.draw(g);
		
		Rectangle k1 = new Rectangle(new point(500,500), 50, 50);
		k1.draw(g);

=======
		Line l1 = new Line(new Point (100,100), new Point(200,200));
		l1.draw(g);
		g.setColor(Color.GREEN);
		l1.getStartPoint().draw(g);
		
		Circle c1 = new Circle(new Point(500,100), 80);
		c1.draw(g);
		c1.getCenter().draw(g);
		
		g.setColor(Color.BLACK);
		Rectengle r1 = new Rectengle(l1.getEndPoint(), 100, 50);
		r1.draw(g);
		
		Donut d1 = new Donut(new Point(800,100), 50, 25);
		d1.draw(g);
		
		Rectengle k1 = new Rectengle(new Point(500,500), 50, 50);
		k1.draw(g);
>>>>>>> branch 'master' of https://github.com/OOIT-2021-2022/ooit-2021-22---projektni-zadatak-IT33_2021_nedaarsenijevic.git
	
	
	//prvi zadaatak osme vezbe 24.5
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(p1);
		shapes.add(l1);
		shapes.add(c1);
		shapes.add(r1);
		shapes.add(d1);
		
		Iterator<Shaoe> it = shapes.iterator();
		while (it.hasNext()) {
			it.next().moveBy(10, 0);
		}
		
		shpes.get(3).draw(g);
		shapes.get(shapes.size() - 1).draw(g);
		
		//izbaciti neki element liste npr drugi
		shapes.remove(1);
		//iscrtati e;ement na datom indeksu
		shapes.get(1).draw(g);
		//dodati liniju u listu tako da ona bude cetvrti element liste
		shapes.add(3, l1); //na kom indeksu, pa tek onda sta dodajemo
		
		
	}
	
}
//za domaci zadatak 5
//izuzeci s ekoriste za kontrolisanje
