package stack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import geometry.Circle;
import geometry.Point;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class StackApplication extends JFrame {

	private JPanel contentPane;
	private DefaultListModel<Circle> dlm = new DefaultListModel<Circle>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StackApplication frame = new StackApplication();
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
	public StackApplication() {
		setTitle("IT33-2021-NEDA-ARSENIJEVIC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(dlm);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CircleDialog circleDialog = new CircleDialog();
				circleDialog.setVisible(true); //dijalog je modalan i dalje liniije koda se nece izvrsavati dok se ovaj dijalog ne zatvori
				if(circleDialog.getCircle() != null) {
					dlm.add(0, circleDialog.getCircle()); //dodajmo na indeks 0 kako bi taj circle uvek bio na vrhu i pogura ostale
				}
				
			}
		});
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CircleDialog circleDialog = new CircleDialog();
				if (dlm.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Stack is empty", "Error", JOptionPane.ERROR_MESSAGE);
					return; //necemo da se izvrsava dalje kod ako je stack prazan
				}
				
				//ovoj set metodi hocemo da prosledimo nas circle sa vrha liste
				circleDialog.setCircle(dlm.get(0));
				circleDialog.setVisible(true); 
				if(circleDialog.getCircle() != null) { //ovde imamo ovaj if jer je dijalog modalan i ako izadjemo iz dijaloga necemo obrisati..
					dlm.remove(0);
			}
			}		
		});
		panel.add(btnDelete);
	}

}
