package drawing;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometry.Circle;
import geometry.Donut;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;
import geometry.Shape;

import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class PaintDrawingApp extends JFrame {

	private JPanel contentPane;
	private Point startPoint = null;

	private Color edgeColor = Color.black;
	private Color fillColor = Color.white;

	// button grupa gde mozemo jedan samo
	private ButtonGroup btngroupShape = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaintDrawingApp frame = new PaintDrawingApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PaintDrawingApp() {
		setBackground(Color.PINK);
		setTitle("IT33-2021-NEDA-ARSENIJEVIC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 192, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		PnlDrawing pnlDrawing = new PnlDrawing();

		pnlDrawing.setBackground(Color.WHITE);
		contentPane.add(pnlDrawing, BorderLayout.CENTER);

		JPanel tlgbButtonPanel = new JPanel();
		tlgbButtonPanel.setBackground(new Color(255, 192, 203));
		contentPane.add(tlgbButtonPanel, BorderLayout.NORTH);
		tlgbButtonPanel.setLayout(new GridLayout(0, 6, 0, 0));

		JToggleButton tglbtnSelect = new JToggleButton("Select");
		tglbtnSelect.setForeground(new Color(255, 20, 147));
		tglbtnSelect.setBackground(new Color(192, 192, 192));
		tglbtnSelect.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 16));
		//tglbtnSelect.setIcon(new ImageIcon(PaintDrawingApp.class.getResource("/icons/click.png")));
		tlgbButtonPanel.add(tglbtnSelect);
		btngroupShape.add(tglbtnSelect);

		JToggleButton tglbtnPoint = new JToggleButton("Point");
		tglbtnPoint.setBackground(new Color(250, 235, 215));
		tglbtnPoint.setForeground(new Color(255, 20, 147));
		tglbtnPoint.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 16));
		//tglbtnPoint.setIcon(new ImageIcon(PaintDrawingApp.class.getResource("/icons/full-stop.png")));
		tglbtnPoint.setSelected(true);
		tglbtnPoint.setHorizontalAlignment(SwingConstants.LEFT);
		tlgbButtonPanel.add(tglbtnPoint);
		btngroupShape.add(tglbtnPoint);

		JToggleButton tglbtnLine = new JToggleButton("Line");
		tglbtnLine.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 16));
		tglbtnLine.setForeground(new Color(255, 20, 147));
		//tglbtnLine.setIcon(new ImageIcon(PaintDrawingApp.class.getResource("/icons/minus.png")));
		tlgbButtonPanel.add(tglbtnLine);
		btngroupShape.add(tglbtnLine);

		JToggleButton tglbtnRectangle = new JToggleButton("Rectangle");
		tglbtnRectangle.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 16));
		tglbtnRectangle.setForeground(new Color(255, 20, 147));
		//tglbtnRectangle.setIcon(new ImageIcon(PaintDrawingApp.class.getResource("/icons/rectangle.png")));
		tlgbButtonPanel.add(tglbtnRectangle);
		btngroupShape.add(tglbtnRectangle);

		JToggleButton tglbtnCircle = new JToggleButton("Circle");
		tglbtnCircle.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 16));
		tglbtnCircle.setForeground(new Color(255, 20, 147));
		//tglbtnCircle.setIcon(new ImageIcon(PaintDrawingApp.class.getResource("/icons/full-moon.png")));
		tlgbButtonPanel.add(tglbtnCircle);
		btngroupShape.add(tglbtnCircle);

		JToggleButton tglbtnDonut = new JToggleButton("Donut");
		tglbtnDonut.setForeground(new Color(255, 20, 147));
		tglbtnDonut.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 16));
		//tglbtnDonut.setIcon(new ImageIcon(PaintDrawingApp.class.getResource("/icons/donut.png")));
		tlgbButtonPanel.add(tglbtnDonut);
		btngroupShape.add(tglbtnDonut); // ubacen oblik u grupu

		JPanel buttonPanel = new JPanel();
		contentPane.add(buttonPanel, BorderLayout.EAST);
		buttonPanel.setLayout(new GridLayout(0, 1, 0, 0));

		JButton btnDelete = new JButton("Delete");
		btnDelete.setForeground(new Color(255, 20, 147));
		btnDelete.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 16));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!pnlDrawing.isEmpty()) {
					if (JOptionPane.showConfirmDialog(null, "Do you really want to delete selected object?", "Yes",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
						pnlDrawing.remove(pnlDrawing.getSelected());
					}
				}
			}
		});
		buttonPanel.add(btnDelete);

		// Modifying

		JButton btnModify = new JButton("Modify");
		btnModify.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 16));
		btnModify.setForeground(new Color(255, 20, 147));
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = pnlDrawing.getSelected();
				if (i == -1) {
					JOptionPane.showMessageDialog(null, "Select an object first", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}

				Shape shape = pnlDrawing.getShape(i);

				if (shape instanceof Point) {
					DlgPoint dlgPoint = new DlgPoint();
					dlgPoint.setPoint((Point) shape);
					dlgPoint.setVisible(true);

					if (dlgPoint.getPoint() != null) {
						((Point) shape).setX(dlgPoint.getPoint().getX());
						((Point) shape).setY(dlgPoint.getPoint().getY());
						//shape.moveTo(dlgPoint.getPoint().getX(), dlgPoint.getPoint().getY()); MOGLO JE OVAKO
						shape.setColor(dlgPoint.getPoint().getColor());
					}
				}

				else if (shape instanceof Line) {
					DlgLine dlgLine = new DlgLine();
					dlgLine.setLine(((Line) shape).getStartPoint(), ((Line) shape).getEndPoint());
					dlgLine.setVisible(true);
					Line line = dlgLine.getLine();

					if (line != null) {
						((Line) shape).setStartPoint(line.getStartPoint());
						((Line) shape).setEndPoint(line.getEndPoint());
						shape.setColor(line.getColor());
					}
				}

				else if (shape instanceof Rectangle) {
					DlgRectangle dlgRectangle = new DlgRectangle();
					dlgRectangle.setRectangle((Rectangle) shape);
					dlgRectangle.setVisible(true);
					Rectangle rect = dlgRectangle.getRectangle();

					if (rect != null) {
						((Rectangle) shape).setUpperLeft(rect.getUpperLeft());
						((Rectangle) shape).setWidth(rect.getWidth());
						((Rectangle) shape).setHeight(rect.getHeight());
						shape.setColor(rect.getColor());
						((Rectangle) shape).setFillColor(rect.getFillColor());
					}
				}

				// prvo donut jer je takodje krug
				else if (shape instanceof Donut) {
					DlgDonut dlgDonut = new DlgDonut();
					dlgDonut.setDonut((Donut) shape);
					dlgDonut.setVisible(true);
					Donut donut = dlgDonut.getDonut();

					if (donut != null) {
						((Donut) shape).setCenter(donut.getCenter());
						((Donut) shape).setRadius(donut.getRadius());
						((Donut) shape).setInnerRadius(donut.getInnerRadius());
						shape.setColor(donut.getColor());
						((Donut) shape).setFillColor(donut.getFillColor());
					}
				}

				else if (shape instanceof Circle) {
					DlgCircle dlgCircle = new DlgCircle();
					dlgCircle.setCircle((Circle) shape);
					dlgCircle.setVisible(true);
					Circle circle = dlgCircle.getCircle();

					if (circle != null) {
						((Circle) shape).setCenter(circle.getCenter());
						((Circle) shape).setRadius(circle.getRadius());
						//shape.moveTo(dlgCircle.getCircle().getCenter().getX(), dlgCircle.getCircle().getCenter().getY());
						shape.setColor(circle.getColor());
						((Circle) shape).setFillColor(circle.getFillColor());
					}
				}

				pnlDrawing.repaint();
			}
		});
		buttonPanel.add(btnModify);

		// mouse listener

		pnlDrawing.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Point clickPosition = new Point(e.getX(), e.getY());

				pnlDrawing.deselectAll();

				if (tglbtnSelect.isSelected()) {
					pnlDrawing.select(clickPosition);
					return;
				}

				if (tglbtnCircle.isSelected()) {
					DlgCircle dlgCircle = new DlgCircle();
					dlgCircle.setPoint(clickPosition);
					dlgCircle.setColors(edgeColor, fillColor);
					dlgCircle.setVisible(true);

					if (dlgCircle.getCircle() != null) {
						pnlDrawing.addShape(dlgCircle.getCircle());
					}

					return;
				}

				if (tglbtnDonut.isSelected()) {
					DlgDonut dlgDonut = new DlgDonut(); 
					dlgDonut.setPoint(clickPosition);
					dlgDonut.setColors(edgeColor, fillColor);
					dlgDonut.setVisible(true);

					if (dlgDonut.getDonut() != null) {
						pnlDrawing.addShape(dlgDonut.getDonut());
					}
					return;
				}

				if (tglbtnRectangle.isSelected()) {
					DlgRectangle dlgRectangle = new DlgRectangle(); 
					dlgRectangle.setPoint(clickPosition);
					dlgRectangle.setColors(edgeColor, fillColor);
					dlgRectangle.setVisible(true);

					if (dlgRectangle.getRectangle() != null) {
						pnlDrawing.addShape(dlgRectangle.getRectangle());
					}
					return;
				}

				if (tglbtnPoint.isSelected()) {
					DlgPoint dlgPoint = new DlgPoint(); 
					dlgPoint.setPoint(clickPosition);
					dlgPoint.setColor(edgeColor);
					dlgPoint.setVisible(true);

					if (dlgPoint.getPoint() != null) {
						pnlDrawing.addShape(dlgPoint.getPoint());
					}
					return;
				}

				if (tglbtnLine.isSelected()) {
					if (startPoint != null) {
						DlgLine dlgLine = new DlgLine();
						dlgLine.setLine(startPoint, clickPosition);
						dlgLine.setColor(edgeColor);
						dlgLine.setVisible(true);

						if (dlgLine.getLine() != null) {
							pnlDrawing.addShape(dlgLine.getLine());
						}
						startPoint = null;
						return;
					} else {
						startPoint = clickPosition;
						return;
					}
				}
			}

		});
	}

}
