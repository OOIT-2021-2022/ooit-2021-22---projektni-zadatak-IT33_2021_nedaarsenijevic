package drawing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometry.Line;
import geometry.Point;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class DlgLine extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldX;
	private JTextField textFieldX2;
	private JTextField textFieldY2;
	private JTextField textFieldY;

	private Color color = null;
	private Line line = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgLine dialog = new DlgLine();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgLine() {
		setTitle("Line");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblDialogName = new JLabel("LINE");
			lblDialogName.setForeground(Color.MAGENTA);
			lblDialogName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
			GridBagConstraints gbc_lblDialogName = new GridBagConstraints();
			gbc_lblDialogName.gridwidth = 2;
			gbc_lblDialogName.insets = new Insets(0, 0, 5, 5);
			gbc_lblDialogName.gridx = 0;
			gbc_lblDialogName.gridy = 0;
			contentPanel.add(lblDialogName, gbc_lblDialogName);
		}
		{
			JLabel lblStartPointCoordinates = new JLabel("Choose START point coordinates");
			lblStartPointCoordinates.setForeground(Color.MAGENTA);
			lblStartPointCoordinates.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
			GridBagConstraints gbc_lblStartPointCoordinates = new GridBagConstraints();
			gbc_lblStartPointCoordinates.gridwidth = 2;
			gbc_lblStartPointCoordinates.insets = new Insets(0, 0, 5, 0);
			gbc_lblStartPointCoordinates.gridx = 0;
			gbc_lblStartPointCoordinates.gridy = 1;
			contentPanel.add(lblStartPointCoordinates, gbc_lblStartPointCoordinates);
		}
		{
			JLabel lblXCoordinate = new JLabel("X coordinate:");
			lblXCoordinate.setForeground(Color.PINK);
			lblXCoordinate.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
			GridBagConstraints gbc_lblXCoordinate = new GridBagConstraints();
			gbc_lblXCoordinate.anchor = GridBagConstraints.WEST;
			gbc_lblXCoordinate.insets = new Insets(0, 0, 5, 5);
			gbc_lblXCoordinate.gridx = 0;
			gbc_lblXCoordinate.gridy = 2;
			contentPanel.add(lblXCoordinate, gbc_lblXCoordinate);
		}
		{
			textFieldX = new JTextField();
			textFieldX.setBackground(UIManager.getColor("info"));
			GridBagConstraints gbc_textFieldX = new GridBagConstraints();
			gbc_textFieldX.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldX.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldX.gridx = 1;
			gbc_textFieldX.gridy = 2;
			contentPanel.add(textFieldX, gbc_textFieldX);
			textFieldX.setColumns(10);
		}
		{
			JLabel lblYCoordinate = new JLabel("Y coordinate:");
			lblYCoordinate.setForeground(Color.PINK);
			lblYCoordinate.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
			GridBagConstraints gbc_lblYCoordinate = new GridBagConstraints();
			gbc_lblYCoordinate.insets = new Insets(0, 0, 5, 5);
			gbc_lblYCoordinate.anchor = GridBagConstraints.WEST;
			gbc_lblYCoordinate.gridx = 0;
			gbc_lblYCoordinate.gridy = 3;
			contentPanel.add(lblYCoordinate, gbc_lblYCoordinate);
		}
		{
			textFieldY = new JTextField();
			textFieldY.setBackground(UIManager.getColor("info"));
			GridBagConstraints gbc_textFieldY = new GridBagConstraints();
			gbc_textFieldY.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldY.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldY.gridx = 1;
			gbc_textFieldY.gridy = 3;
			contentPanel.add(textFieldY, gbc_textFieldY);
			textFieldY.setColumns(10);
		}
		{
			JLabel lblEndPointCoordinates = new JLabel("Choose END point coordinates");
			lblEndPointCoordinates.setForeground(Color.MAGENTA);
			lblEndPointCoordinates.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
			GridBagConstraints gbc_lblEndPointCoordinates = new GridBagConstraints();
			gbc_lblEndPointCoordinates.gridwidth = 2;
			gbc_lblEndPointCoordinates.insets = new Insets(0, 0, 5, 0);
			gbc_lblEndPointCoordinates.gridx = 0;
			gbc_lblEndPointCoordinates.gridy = 4;
			contentPanel.add(lblEndPointCoordinates, gbc_lblEndPointCoordinates);
		}
		{
			JLabel lblXCoordinate = new JLabel("X coordinate:");
			lblXCoordinate.setForeground(Color.PINK);
			lblXCoordinate.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
			GridBagConstraints gbc_lblXCoordinate = new GridBagConstraints();
			gbc_lblXCoordinate.insets = new Insets(0, 0, 5, 5);
			gbc_lblXCoordinate.anchor = GridBagConstraints.WEST;
			gbc_lblXCoordinate.gridx = 0;
			gbc_lblXCoordinate.gridy = 5;
			contentPanel.add(lblXCoordinate, gbc_lblXCoordinate);
		}
		{
			textFieldX2 = new JTextField();
			textFieldX2.setBackground(UIManager.getColor("info"));
			GridBagConstraints gbc_textFieldX2 = new GridBagConstraints();
			gbc_textFieldX2.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldX2.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldX2.gridx = 1;
			gbc_textFieldX2.gridy = 5;
			contentPanel.add(textFieldX2, gbc_textFieldX2);
			textFieldX2.setColumns(10);
		}
		{
			JLabel lblYKoordinata_1 = new JLabel("Y coordinate:");
			lblYKoordinata_1.setForeground(Color.PINK);
			lblYKoordinata_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
			GridBagConstraints gbc_lblYKoordinata_1 = new GridBagConstraints();
			gbc_lblYKoordinata_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblYKoordinata_1.anchor = GridBagConstraints.WEST;
			gbc_lblYKoordinata_1.gridx = 0;
			gbc_lblYKoordinata_1.gridy = 6;
			contentPanel.add(lblYKoordinata_1, gbc_lblYKoordinata_1);
		}
		{
			textFieldY2 = new JTextField();
			textFieldY2.setBackground(UIManager.getColor("info"));
			GridBagConstraints gbc_textFieldY2 = new GridBagConstraints();
			gbc_textFieldY2.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldY2.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldY2.gridx = 1;
			gbc_textFieldY2.gridy = 6;
			contentPanel.add(textFieldY2, gbc_textFieldY2);
			textFieldY2.setColumns(10);
		}
		{
			JButton btnColor = new JButton("Color");
			btnColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					color = JColorChooser.showDialog(null, "Choose color", color);
					if (color == null) {
						color = Color.BLACK;
					}
				}
			});
			btnColor.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
			GridBagConstraints gbc_btnColor = new GridBagConstraints();
			gbc_btnColor.gridwidth = 2;
			gbc_btnColor.gridx = 0;
			gbc_btnColor.gridy = 7;
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
							int x1 = Integer.parseInt(textFieldX.getText());
							int y1 = Integer.parseInt(textFieldY.getText());

							int x2 = Integer.parseInt(textFieldX2.getText());
							int y2 = Integer.parseInt(textFieldY2.getText());

							if (x1 < 0 || y1 < 0) {
								JOptionPane.showMessageDialog(null, "Start point coordinates must be positive", "Error",
										JOptionPane.ERROR_MESSAGE);
								return;
							}
							if (x2 < 0 || y2 < 0) {
								JOptionPane.showMessageDialog(null, "End point coordinates must be positive", "Error",
										JOptionPane.ERROR_MESSAGE);
								return;
							}

							line = new Line(new Point(x1, y1), new Point(x2, y2), color);
							dispose();

						} catch (Exception exception) {
							JOptionPane.showMessageDialog(null, "Invalid data type", "Error",
									JOptionPane.ERROR_MESSAGE);
							return;
						}

					}
				});
				okButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	//geting coordinates for those tho points and setting them in text field
	
	public void setLine(Point startPoint, Point endPoint) {
		textFieldX.setText("" + startPoint.getX());
		textFieldY.setText("" + startPoint.getY());

		textFieldX2.setText("" + endPoint.getX());
		textFieldY2.setText("" + endPoint.getY());
	}

	public Line getLine() {
		return line;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}