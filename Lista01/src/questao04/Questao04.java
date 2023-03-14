package questao04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class Questao04 extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao04 frame = new Questao04();
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
	public Questao04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSoma = new JButton("+");
		btnSoma.setForeground(new Color(128, 0, 255));
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float num1 = Float.valueOf (text1.getText());
				float num2 = Float.valueOf (text2.getText());
				
				float soma = num1+num2; 
				
				JOptionPane.showMessageDialog(btnSoma, soma);
			}
		});
		btnSoma.setBounds(86, 78, 89, 23);
		contentPane.add(btnSoma);
		
		JButton btnSub = new JButton("-");
		btnSub.setForeground(new Color(128, 0, 255));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float num1 = Float.valueOf (text1.getText());
				float num2 = Float.valueOf (text2.getText());
				
				float sub = num1 - num2; 
				
				JOptionPane.showMessageDialog(btnSub,sub);
			}
		});
		btnSub.setBounds(231, 78, 89, 23);
		contentPane.add(btnSub);
		
		
		JButton btnDiv = new JButton("-");
		btnDiv.setForeground(new Color(128, 0, 255));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float num1 = Float.valueOf (text1.getText());
				float num2 = Float.valueOf (text2.getText());
				
				float div = num1 / num2; 
				
				JOptionPane.showMessageDialog(btnDiv,div);
			}
		});
		
		btnDiv.setBounds(86, 146, 89, 23);
		contentPane.add(btnDiv);
		
		JButton btnMulti = new JButton("-");
		btnMulti.setForeground(new Color(128, 0, 255));
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float num1 = Float.valueOf (text1.getText());
				float num2 = Float.valueOf (text2.getText());
				
				float mult = num1 * num2; 
				
				JOptionPane.showMessageDialog(btnMulti,mult);
			}
		});
		
		btnMulti.setBounds(231, 146, 89, 23);
		contentPane.add(btnMulti);
		
		
		
		
		text1 = new JTextField();
		text1.setBackground(Color.LIGHT_GRAY);
		text1.setBounds(86, 26, 86, 20);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setBackground(Color.LIGHT_GRAY);
		text2.setBounds(231, 26, 86, 20);
		contentPane.add(text2);
		text2.setColumns(10);
		
		
		
	}
}
