package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmTest extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup btnGroup = new ButtonGroup() ;
	private DefaultListModel<String> dlm = new DefaultListModel<>();
	private JLabel lblCrvena;
	private JLabel lblPlava;
	private JLabel lblZuta;
	private JTextField txtDodajBoju;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTest frame = new FrmTest();
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
	public FrmTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel pnlSouth = new JPanel();
		contentPane.add(pnlSouth);
		
		JPanel pnlCentar = new JPanel();
		contentPane.add(pnlCentar);
		GridBagLayout gbl_pnlCentar = new GridBagLayout();
		gbl_pnlCentar.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlCentar.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pnlCentar.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlCentar.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		pnlCentar.setLayout(gbl_pnlCentar);
		
		JToggleButton tglbtnCrvena = new JToggleButton("Crvena");
		tglbtnCrvena.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dlm.addElement(lblCrvena.getText());
				
				lblCrvena.setForeground(Color.RED);
				lblPlava.setForeground(Color.black);
				lblZuta.setForeground(Color.black);
			}
		});
		
		JLabel lblDodajBoju = new JLabel("Dodaj Boju");
		GridBagConstraints gbc_lblDodajBoju = new GridBagConstraints();
		gbc_lblDodajBoju.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblDodajBoju.insets = new Insets(0, 0, 5, 5);
		gbc_lblDodajBoju.gridx = 0;
		gbc_lblDodajBoju.gridy = 0;
		pnlCentar.add(lblDodajBoju, gbc_lblDodajBoju);
		
		txtDodajBoju = new JTextField();
		txtDodajBoju.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					dlm.addElement(txtDodajBoju.getText());
					txtDodajBoju.setText("");
				}
			}
		});
		txtDodajBoju.setText("");
		GridBagConstraints gbc_txtDodajBoju = new GridBagConstraints();
		gbc_txtDodajBoju.insets = new Insets(0, 0, 5, 5);
		gbc_txtDodajBoju.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDodajBoju.gridx = 1;
		gbc_txtDodajBoju.gridy = 0;
		pnlCentar.add(txtDodajBoju, gbc_txtDodajBoju);
		txtDodajBoju.setColumns(10);
		tglbtnCrvena.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		GridBagConstraints gbc_tglbtnCrvena = new GridBagConstraints();
		gbc_tglbtnCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnCrvena.gridx = 0;
		gbc_tglbtnCrvena.gridy = 1;
		pnlCentar.add(tglbtnCrvena, gbc_tglbtnCrvena);
		
		
		btnGroup.add(tglbtnCrvena);
		lblCrvena = new JLabel("Crvena");
		GridBagConstraints gbc_lblCrvena = new GridBagConstraints();
		gbc_lblCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrvena.gridx = 1;
		gbc_lblCrvena.gridy = 1;
		pnlCentar.add(lblCrvena, gbc_lblCrvena);
		
		
		JToggleButton tglbtnPlava = new JToggleButton("Plava");
		tglbtnPlava.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dlm.addElement(lblPlava.getText());
				lblCrvena.setForeground(Color.black);
				lblPlava.setForeground(Color.blue);
				lblZuta.setForeground(Color.black);
			}
		});
		tglbtnPlava.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		GridBagConstraints gbc_tglbtnPlava = new GridBagConstraints();
		gbc_tglbtnPlava.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnPlava.gridx = 0;
		gbc_tglbtnPlava.gridy = 2;
		pnlCentar.add(tglbtnPlava, gbc_tglbtnPlava);
		btnGroup.add(tglbtnPlava);
		
		lblPlava = new JLabel("Plava");
		GridBagConstraints gbc_lblPlava = new GridBagConstraints();
		gbc_lblPlava.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlava.gridx = 1;
		gbc_lblPlava.gridy = 2;
		pnlCentar.add(lblPlava, gbc_lblPlava);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.gridheight = 3;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 6;
		gbc_scrollPane.gridy = 2;
		pnlCentar.add(scrollPane, gbc_scrollPane);
		
		JList lstBoje = new JList();
		scrollPane.setViewportView(lstBoje);
		lstBoje.setModel(dlm);
		
		
		JToggleButton tglbtnZuta = new JToggleButton("Zuta");
		tglbtnZuta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dlm.addElement(lblZuta.getText());
				lblCrvena.setForeground(Color.black);
				lblPlava.setForeground(Color.black);
				lblZuta.setForeground(Color.yellow);
			}
		});
		tglbtnZuta.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		GridBagConstraints gbc_tglbtnZuta = new GridBagConstraints();
		gbc_tglbtnZuta.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnZuta.gridx = 0;
		gbc_tglbtnZuta.gridy = 3;
		pnlCentar.add(tglbtnZuta, gbc_tglbtnZuta);
		btnGroup.add(tglbtnZuta);
		
		lblZuta = new JLabel("Zuta");
		GridBagConstraints gbc_lblZuta = new GridBagConstraints();
		gbc_lblZuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblZuta.gridx = 1;
		gbc_lblZuta.gridy = 3;
		pnlCentar.add(lblZuta, gbc_lblZuta);
		
		JLabel lblDodatneBoje = new JLabel("Dodatne boje");
		GridBagConstraints gbc_lblDodatneBoje = new GridBagConstraints();
		gbc_lblDodatneBoje.anchor = GridBagConstraints.EAST;
		gbc_lblDodatneBoje.insets = new Insets(0, 0, 0, 5);
		gbc_lblDodatneBoje.gridx = 0;
		gbc_lblDodatneBoje.gridy = 4;
		pnlCentar.add(lblDodatneBoje, gbc_lblDodatneBoje);
		
		JComboBox <String> cmbDodatneBoje = new JComboBox();
		cmbDodatneBoje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dlm.addElement(cmbDodatneBoje.getSelectedItem().toString());
				
				switch(cmbDodatneBoje.getSelectedItem().toString()) {
				case "Zelena" :
					lblDodatneBoje.setForeground(Color.GREEN);
					break;
				case "Narandzasta":
					lblDodatneBoje.setForeground(Color.ORANGE);
					break;
				case "Ljubicasta" :
					lblDodatneBoje.setForeground(Color.MAGENTA);
					break;
				default:
				lblDodatneBoje.setForeground(Color.BLACK);
				break;	
				}
			}
		});
		cmbDodatneBoje.setModel(new DefaultComboBoxModel <String>(new String[] {"Zelena", "Narandzasta", "Ljubicasta"}));
		GridBagConstraints gbc_cmbDodatneBoje = new GridBagConstraints();
		gbc_cmbDodatneBoje.insets = new Insets(0, 0, 0, 5);
		gbc_cmbDodatneBoje.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbDodatneBoje.gridx = 1;
		gbc_cmbDodatneBoje.gridy = 4;
		pnlCentar.add(cmbDodatneBoje, gbc_cmbDodatneBoje);
		
		JButton btnispis = new JButton("Klikni me");
		contentPane.add(btnispis);
		
		JButton btnDodajBoju = new JButton("Dodaj Boju");
		contentPane.add(btnDodajBoju);
		btnispis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Antistres Dugme", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}

}
