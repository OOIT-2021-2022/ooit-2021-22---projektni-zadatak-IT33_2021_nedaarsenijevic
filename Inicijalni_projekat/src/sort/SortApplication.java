package sort;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import geometry.Point;
import geometry.Circle;
public class SortApplication extends JFrame {

	private JPanel contentPane;
	DefaultListModel<Circle> dlm = new DefaultListModel<Circle>();
	ArrayList<Circle> circles = new ArrayList<Circle>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortApplication frame = new SortApplication();
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
	public SortApplication() {
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
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CircleDialog circleDialog = new CircleDialog();
				circleDialog.setVisible(true);
				if(circleDialog.getCircle() != null) {
					circles.add(circleDialog.getCircle()); //dodajemo na listu
					circles.sort(null);
					dlm.clear(); //hocemo da obrisemo sve elemente iz liste dlm kako bismo dodali one  iz circle
					for( int i=0; i < circles.size(); i++) {
						dlm.add(i, circles.get(i));
						
						
					}
					
				}
			}
		});
		panel.add(btnAdd);
	}

}
