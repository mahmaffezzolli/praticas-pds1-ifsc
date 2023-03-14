package questao05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Questao05 extends JFrame {

	private JPanel contentPane;
	private JTextField txtTri1;
	private JTextField txtTri2;
	private JTextField txtTri3;

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
		
		txtTri1 = new JTextField();
		txtTri1.setBounds(50, 62, 86, 20);
		contentPane.add(txtTri1);
		txtTri1.setColumns(10);
		
		txtTri2 = new JTextField();
		txtTri2.setBounds(193, 62, 86, 20);
		contentPane.add(txtTri2);
		txtTri2.setColumns(10);
		
		txtTri3 = new JTextField();
		txtTri3.setBounds(338, 62, 86, 20);
		contentPane.add(txtTri3);
		txtTri3.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirmar ");
		btnConfirm.setBounds(169, 156, 89, 23);
		contentPane.add(btnConfirm);
		btnConfirm.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				
				float tri1 = Float.valueOf(txtTri1.getText());
				float tri2 = Float.valueOf(txtTri2.getText());
				float tri3 = Float.valueOf(txtTri3.getText());
				
		if ((tri1 == tri2) && (tri1 == tri3) && (tri2 == tri3) ){
			JOptionPane.showMessageDialog(null, "o triangulo é equilatero!");
			
		}
		
		else if ((tri1 == tri2) || (tri1 == tri3) || (tri2 == tri3) ){
			JOptionPane.showMessageDialog(null, "o triangulo é isoceles!");
				
			}
		else{
			JOptionPane.showMessageDialog(null, "o triangulo é escaleno!");

		}
			}
		});
		
	}
}
