package questao05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questao05 extends JFrame {

	private JPanel contentPane;
	private JTextField tri1;
	private JTextField tri2;
	private JTextField tri3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao05 frame = new Questao05();
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
	public Questao05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tri1 = new JTextField();
		tri1.setBounds(50, 62, 86, 20);
		contentPane.add(tri1);
		tri1.setColumns(10);
		
		tri2 = new JTextField();
		tri2.setBounds(193, 62, 86, 20);
		contentPane.add(tri2);
		tri2.setColumns(10);
		
		tri3 = new JTextField();
		tri3.setBounds(338, 62, 86, 20);
		contentPane.add(tri3);
		tri3.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
			}
		});
		btnNewButton.setBounds(165, 183, 89, 23);
		contentPane.add(btnNewButton);
	}

}
