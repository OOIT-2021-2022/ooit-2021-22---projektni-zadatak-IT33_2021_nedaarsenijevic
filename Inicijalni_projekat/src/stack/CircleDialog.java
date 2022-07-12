import java.awt.BorderLayout;


import java.awt.Color;
import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometry.Point;
import geometry.Circle;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircleDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private int radius;
	private Point center;
	
	private Circle circle = null;
	
	private JTextField textFieldY;
	private JTextField textFieldX;
	private JTextField textFieldRadius;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CircleDialog dialog = new CircleDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CircleDialog() {
		setModal(true);
		setResizable(false);
		setTitle("IT33-2021-NEDA-ARSENIJEVIC-STACK");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{179, 86, 0};
		gbl_contentPanel.rowHeights = new int[]{20, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblXCordinate = new JLabel("X cordinate");
			lblXCordinate.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
			GridBagConstraints gbc_lblXCordinate = new GridBagConstraints();
			gbc_lblXCordinate.insets = new Insets(0, 0, 5, 5);
			gbc_lblXCordinate.anchor = GridBagConstraints.EAST;
			gbc_lblXCordinate.gridx = 0;
			gbc_lblXCordinate.gridy = 0;
			contentPanel.add(lblXCordinate, gbc_lblXCordinate);
		}
		{
			textFieldX = new JTextField();
			GridBagConstraints gbc_textFieldX = new GridBagConstraints();
			gbc_textFieldX.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldX.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldX.gridx = 1;
			gbc_textFieldX.gridy = 0;
			contentPanel.add(textFieldX, gbc_textFieldX);
			textFieldX.setColumns(10);
		}
		{
			JLabel lblYCordinate = new JLabel("Y cordinate");
			lblYCordinate.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
			GridBagConstraints gbc_lblYCordinate = new GridBagConstraints();
			gbc_lblYCordinate.anchor = GridBagConstraints.EAST;
			gbc_lblYCordinate.insets = new Insets(0, 0, 5, 5);
			gbc_lblYCordinate.gridx = 0;
			gbc_lblYCordinate.gridy = 1;
			contentPanel.add(lblYCordinate, gbc_lblYCordinate);
		}
		{
			textFieldY = new JTextField();
			GridBagConstraints gbc_textFieldY = new GridBagConstraints();
			gbc_textFieldY.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldY.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldY.gridx = 1;
			gbc_textFieldY.gridy = 1;
			contentPanel.add(textFieldY, gbc_textFieldY);
			textFieldY.setColumns(10);
		}
		{
			JLabel lblRadius = new JLabel("Radius");
			lblRadius.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
			GridBagConstraints gbc_lblRadius = new GridBagConstraints();
			gbc_lblRadius.anchor = GridBagConstraints.EAST;
			gbc_lblRadius.insets = new Insets(0, 0, 0, 5);
			gbc_lblRadius.gridx = 0;
			gbc_lblRadius.gridy = 2;
			contentPanel.add(lblRadius, gbc_lblRadius);
		}
		{
			textFieldRadius = new JTextField();
			GridBagConstraints gbc_textFieldRadius = new GridBagConstraints();
			gbc_textFieldRadius.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldRadius.gridx = 1;
			gbc_textFieldRadius.gridy = 2;
			contentPanel.add(textFieldRadius, gbc_textFieldRadius);
			textFieldRadius.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							int x = Integer.parseInt(textFieldX.getText());
							int y = Integer.parseInt(textFieldY.getText());
							int radius = Integer.parseInt(textFieldRadius.getText());
							
							if (x < 0 || y < 0 || radius < 0) {
								JOptionPane.showMessageDialog(null, "Sorry, but numbers must be positive!", "Error", JOptionPane.ERROR_MESSAGE);
								return;
							}
							circle = new Circle (new Point(x, y), radius);
							dispose(); //ova metoda zatvara dijalog
						}catch (Exception exception) {
							JOptionPane.showMessageDialog(null, "Invalid character found!!", "Error", JOptionPane.ERROR_MESSAGE);
						}
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public Circle getCircle() {
		return this.circle;
	}
	
	public void setCircle(Circle c) {
		textFieldX.setText("" + c.getCenter().getX());
		textFieldY.setText("" + c.getCenter().getY());
		textFieldRadius.setText("" + c.getRadius());
	}

}