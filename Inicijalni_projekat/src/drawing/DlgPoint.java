package drawing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometry.Point;
import geometry.Rectangle;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class DlgPoint extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldX;
	private JTextField textFieldY;
	private Color color;

	private Point point = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgPoint dialog = new DlgPoint();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgPoint() {
		setTitle("Point");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 330, 225);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblDialogName = new JLabel("POINT");
			lblDialogName.setForeground(UIManager.getColor("textHighlight"));
			lblDialogName.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
			GridBagConstraints gbc_lblDialogName = new GridBagConstraints();
			gbc_lblDialogName.gridwidth = 7;
			gbc_lblDialogName.insets = new Insets(0, 0, 5, 5);
			gbc_lblDialogName.gridx = 0;
			gbc_lblDialogName.gridy = 0;
			contentPanel.add(lblDialogName, gbc_lblDialogName);
		}
		{
			JLabel lblNewLabel = new JLabel("");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 2;
			gbc_lblNewLabel.gridy = 1;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			JLabel lblXcoordinate = new JLabel("X coordinate:");
			lblXcoordinate.setForeground(Color.BLUE);
			lblXcoordinate.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
			GridBagConstraints gbc_lblXcoordinate = new GridBagConstraints();
			gbc_lblXcoordinate.gridwidth = 2;
			gbc_lblXcoordinate.anchor = GridBagConstraints.EAST;
			gbc_lblXcoordinate.insets = new Insets(0, 0, 5, 5);
			gbc_lblXcoordinate.gridx = 0;
			gbc_lblXcoordinate.gridy = 2;
			contentPanel.add(lblXcoordinate, gbc_lblXcoordinate);
		}
		{
			textFieldX = new JTextField();
			textFieldX.setForeground(Color.BLACK);
			textFieldX.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
			GridBagConstraints gbc_textFieldX = new GridBagConstraints();
			gbc_textFieldX.gridwidth = 2;
			gbc_textFieldX.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldX.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldX.gridx = 2;
			gbc_textFieldX.gridy = 2;
			contentPanel.add(textFieldX, gbc_textFieldX);
			textFieldX.setColumns(10);
		}
		{
			JLabel lblYCoordinate = new JLabel("Y coordinate:");
			lblYCoordinate.setForeground(Color.BLUE);
			lblYCoordinate.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
			GridBagConstraints gbc_lblYCoordinate = new GridBagConstraints();
			gbc_lblYCoordinate.gridwidth = 2;
			gbc_lblYCoordinate.anchor = GridBagConstraints.EAST;
			gbc_lblYCoordinate.insets = new Insets(0, 0, 5, 5);
			gbc_lblYCoordinate.gridx = 0;
			gbc_lblYCoordinate.gridy = 3;
			contentPanel.add(lblYCoordinate, gbc_lblYCoordinate);
		}
		{
			textFieldY = new JTextField();
			textFieldY.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
			GridBagConstraints gbc_textFieldY = new GridBagConstraints();
			gbc_textFieldY.gridwidth = 2;
			gbc_textFieldY.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldY.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldY.gridx = 2;
			gbc_textFieldY.gridy = 3;
			contentPanel.add(textFieldY, gbc_textFieldY);
			textFieldY.setColumns(10);
		}
		{
			JButton btnColor = new JButton("Color");
			btnColor.setBackground(Color.CYAN);
			btnColor.setForeground(Color.BLUE);
			btnColor.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
			btnColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					color = JColorChooser.showDialog(null, "Choose color", color);
					if (color == null) {
						color = Color.BLACK;
					}
				}
			});
			GridBagConstraints gbc_btnColor = new GridBagConstraints();
			gbc_btnColor.insets = new Insets(0, 0, 0, 5);
			gbc_btnColor.gridwidth = 7;
			gbc_btnColor.gridx = 0;
			gbc_btnColor.gridy = 5;
			contentPanel.add(btnColor, gbc_btnColor);
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

							if (x < 0 || y < 0) {
								JOptionPane.showMessageDialog(null, "Coordinate values must be positive!", "Error",
										JOptionPane.ERROR_MESSAGE);
								return;
							}

							point = new Point(x, y, color);
							dispose();

						} catch (Exception exception) {
							JOptionPane.showMessageDialog(null, "Invalid data type", "Error",
									JOptionPane.ERROR_MESSAGE);
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
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point p) {
		textFieldX.setText("" + p.getX());
		textFieldY.setText("" + p.getY());
		this.color = p.getColor();
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
