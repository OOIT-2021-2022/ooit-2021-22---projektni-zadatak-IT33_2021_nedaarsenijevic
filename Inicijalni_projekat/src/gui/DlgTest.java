package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class DlgTest extends JDialog {

	private final JPanel contentPanel = new JPanel();
	protected boolean isOk;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgTest dialog = new DlgTest();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true); //postavljamo da je vidljiv
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgTest() {
		setBounds(100, 100, 450, 300);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{434, 0};
		gridBagLayout.rowHeights = new int[]{228, 33, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagConstraints gbc_contentPanel = new GridBagConstraints();
		gbc_contentPanel.fill = GridBagConstraints.BOTH;
		gbc_contentPanel.insets = new Insets(0, 0, 5, 0);
		gbc_contentPanel.gridx = 0;
		gbc_contentPanel.gridy = 0;
		getContentPane().add(contentPanel, gbc_contentPanel);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{207, 20, 0};
		gbl_contentPanel.rowHeights = new int[]{14, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblRed = new JLabel("RED");
			GridBagConstraints gbc_lblRed = new GridBagConstraints();
			gbc_lblRed.anchor = GridBagConstraints.EAST;
			gbc_lblRed.insets = new Insets(0, 0, 5, 5);
			gbc_lblRed.gridx = 0;
			gbc_lblRed.gridy = 1;
			contentPanel.add(lblRed, gbc_lblRed);
		}
		{
			textField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 0, 5, 0);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 1;
			gbc_textField.gridy = 1;
			contentPanel.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			JLabel lblGreen = new JLabel("GREEN");
			GridBagConstraints gbc_lblGreen = new GridBagConstraints();
			gbc_lblGreen.anchor = GridBagConstraints.EAST;
			gbc_lblGreen.insets = new Insets(0, 0, 5, 5);
			gbc_lblGreen.gridx = 0;
			gbc_lblGreen.gridy = 2;
			contentPanel.add(lblGreen, gbc_lblGreen);
		}
		{
			textField_1 = new JTextField();
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.insets = new Insets(0, 0, 5, 0);
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.gridx = 1;
			gbc_textField_1.gridy = 2;
			contentPanel.add(textField_1, gbc_textField_1);
			textField_1.setColumns(10);
		}
		{
			JLabel lblBlue = new JLabel("BLUE");
			GridBagConstraints gbc_lblBlue = new GridBagConstraints();
			gbc_lblBlue.anchor = GridBagConstraints.EAST;
			gbc_lblBlue.insets = new Insets(0, 0, 0, 5);
			gbc_lblBlue.gridx = 0;
			gbc_lblBlue.gridy = 3;
			contentPanel.add(lblBlue, gbc_lblBlue);
		}
		{
			textField_2 = new JTextField();
			GridBagConstraints gbc_textField_2 = new GridBagConstraints();
			gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_2.gridx = 1;
			gbc_textField_2.gridy = 3;
			contentPanel.add(textField_2, gbc_textField_2);
			textField_2.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			GridBagConstraints gbc_buttonPane = new GridBagConstraints();
			gbc_buttonPane.anchor = GridBagConstraints.NORTH;
			gbc_buttonPane.fill = GridBagConstraints.HORIZONTAL;
			gbc_buttonPane.gridx = 0;
			gbc_buttonPane.gridy = 1;
			getContentPane().add(buttonPane, gbc_buttonPane);
			{
				JButton btnIzmeniBoju = new JButton("IzmeniBoju");
				btnIzmeniBoju.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						DlgTest dlgTest = new DlgTest();
						
						String[] rgb = dlm.getElementAt(lstBoje.getSelectedIndex()).toString().split(" ");
					}
				});
				buttonPane.add(btnIzmeniBoju);
			}
			{ //automatski dodata ova dva butona
				JButton okButton = new JButton("OK");
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

}
