package drawing;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometry.Circle;
import geometry.Point;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class DlgCircle extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldX;
	private JTextField textFieldY;
	private JTextField textFieldRadius;

	private Point center;
	private int radius;

	private Circle circle = null;

	private Color edgeColor;
	private Color fillColor;

	private Color color;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgCircle dialog = new DlgCircle();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgCircle() {
		setTitle("Circle\r\n");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 421, 266);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 224));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			GridBagLayout gbl_contentPanel = new GridBagLayout();
			gbl_contentPanel.columnWidths = new int[] { 30, 30, 30, 30, 0, 0, 0, 0, 0, 0, 0 };
			gbl_contentPanel.rowHeights = new int[] { 30, 30, 30, 30 };
			gbl_contentPanel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
			gbl_contentPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
			contentPanel.setLayout(gbl_contentPanel);
		}
		{
			JLabel lblCenterXcoord = new JLabel("Choose X coordinate :");
			lblCenterXcoord.setForeground(new Color(255, 20, 147));
			lblCenterXcoord.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
			GridBagConstraints gbc_lblCenterXcoord = new GridBagConstraints();
			gbc_lblCenterXcoord.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblCenterXcoord.gridwidth = 5;
			gbc_lblCenterXcoord.insets = new Insets(0, 0, 5, 5);
			gbc_lblCenterXcoord.gridx = 0;
			gbc_lblCenterXcoord.gridy = 0;
			contentPanel.add(lblCenterXcoord, gbc_lblCenterXcoord);
		}
		{
			textFieldX = new JTextField();
			textFieldX.setBackground(new Color(250, 235, 215));
			textFieldX.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
			GridBagConstraints gbc_textFieldX = new GridBagConstraints();
			gbc_textFieldX.gridwidth = 6;
			gbc_textFieldX.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldX.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldX.gridx = 5;
			gbc_textFieldX.gridy = 0;
			contentPanel.add(textFieldX, gbc_textFieldX);
			textFieldX.setColumns(100);
		}
		{
			JLabel lblCenterYcoord = new JLabel("Choose Y coordinate :");
			lblCenterYcoord.setForeground(new Color(255, 20, 147));
			lblCenterYcoord.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
			GridBagConstraints gbc_lblCenterYcoord = new GridBagConstraints();
			gbc_lblCenterYcoord.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblCenterYcoord.gridwidth = 5;
			gbc_lblCenterYcoord.insets = new Insets(0, 0, 5, 5);
			gbc_lblCenterYcoord.gridx = 0;
			gbc_lblCenterYcoord.gridy = 1;
			contentPanel.add(lblCenterYcoord, gbc_lblCenterYcoord);
		}
		{
		}
		{
			textFieldY = new JTextField();
			textFieldY.setBackground(new Color(250, 235, 215));
			textFieldY.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
			GridBagConstraints gbc_textFieldY = new GridBagConstraints();
			gbc_textFieldY.gridwidth = 6;
			gbc_textFieldY.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldY.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldY.gridx = 5;
			gbc_textFieldY.gridy = 1;
			contentPanel.add(textFieldY, gbc_textFieldY);
			textFieldY.setColumns(10);
		}
		{
			JLabel lblRadius = new JLabel("Set circle radius :\r\n");
			lblRadius.setForeground(new Color(255, 20, 147));
			lblRadius.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
			GridBagConstraints gbc_lblRadius = new GridBagConstraints();
			gbc_lblRadius.anchor = GridBagConstraints.EAST;
			gbc_lblRadius.gridwidth = 5;
			gbc_lblRadius.insets = new Insets(0, 0, 5, 5);
			gbc_lblRadius.gridx = 0;
			gbc_lblRadius.gridy = 2;
			contentPanel.add(lblRadius, gbc_lblRadius);
		}
		JButton btnFillColor = new JButton("Fill color");
		btnFillColor.setFont(new Font("Baskerville Old Face", Font.PLAIN, 13));
		btnFillColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				fillColor = JColorChooser.showDialog(null, "Choose fill color", edgeColor);
				if (fillColor == null) {
					fillColor = Color.WHITE;
				}
			}
		});
		{
			textFieldRadius = new JTextField();
			textFieldRadius.setBackground(new Color(250, 235, 215));
			GridBagConstraints gbc_textFieldRadius = new GridBagConstraints();
			gbc_textFieldRadius.gridwidth = 6;
			gbc_textFieldRadius.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldRadius.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldRadius.gridx = 5;
			gbc_textFieldRadius.gridy = 2;
			contentPanel.add(textFieldRadius, gbc_textFieldRadius);
			textFieldRadius.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 54));
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.gridx = 5;
			gbc_lblNewLabel_1.gridy = 4;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}
		GridBagConstraints gbc_btnFillColor = new GridBagConstraints();
		gbc_btnFillColor.gridwidth = 3;
		gbc_btnFillColor.insets = new Insets(0, 0, 0, 5);
		gbc_btnFillColor.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnFillColor.gridx = 1;
		gbc_btnFillColor.gridy = 5;
		contentPanel.add(btnFillColor, gbc_btnFillColor);
		JButton btnEdgeColor = new JButton("Edge color");
		btnEdgeColor.setFont(new Font("Baskerville Old Face", Font.PLAIN, 13));
		btnEdgeColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edgeColor = JColorChooser.showDialog(null, "Choose edge color", Color.BLACK);
				if (edgeColor == null) {
					edgeColor = Color.BLACK;

				}
			}
		});
		GridBagConstraints gbc_btnEdgeColor = new GridBagConstraints();
		gbc_btnEdgeColor.insets = new Insets(0, 0, 0, 5);
		gbc_btnEdgeColor.gridx = 7;
		gbc_btnEdgeColor.gridy = 5;
		contentPanel.add(btnEdgeColor, gbc_btnEdgeColor);
		{
			JLabel lblCircle = new JLabel("CIRCLE");
			lblCircle.setBackground(new Color(255, 255, 224));
			lblCircle.setForeground(new Color(255, 20, 147));
			lblCircle.setHorizontalAlignment(SwingConstants.CENTER);
			lblCircle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
			getContentPane().add(lblCircle, BorderLayout.NORTH);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 255, 224));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							int x = Integer.parseInt(textFieldX.getText());
							int y = Integer.parseInt(textFieldY.getText());
							int radius = Integer.parseInt(textFieldRadius.getText());

							if (x <= 0 || y <= 0 || radius <= 0) {
								JOptionPane.showMessageDialog(null, "Values must be positive!", "Error",
										JOptionPane.ERROR_MESSAGE);
								return;
							}

							circle = new Circle(new Point(x, y), radius, edgeColor, fillColor);
							dispose();

						} catch (Exception exception) {
							JOptionPane.showMessageDialog(null, "Invalid data type", "Error",
									JOptionPane.ERROR_MESSAGE);
							return;
						}

					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public Circle getCircle() {
		return this.circle;
	}

// method za coordinate u text field
	
	public void setPoint(Point p) {
		textFieldX.setText("" + p.getX());
		textFieldY.setText("" + p.getY());
	}

	public void setCircle(Circle c) {
		setPoint(c.getCenter());
		setColors(c.getColor(), c.getFillColor());
		textFieldRadius.setText("" + c.getRadius());
	}
	
	public void setColors(Color edgeColor, Color fillColor) {
		this.edgeColor = edgeColor;
		this.fillColor = fillColor;
	}
	
}
