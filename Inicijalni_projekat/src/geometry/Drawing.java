package geometry;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel{

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

	}

}
//za domaci zadatak 5