package questao01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Questao01 extends JFrame {

	private JPanel contentPane;
	private JTextField textNum;
	private JTextField textResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao01 frame = new Questao01();
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
	public Questao01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNum = new JTextField();
		textNum.setBounds(68, 60, 86, 20);
		contentPane.add(textNum);
		textNum.setColumns(10);
		
		textResult = new JTextField();
		textResult.setEditable(false);
		textResult.setBounds(264, 60, 86, 20);
		contentPane.add(textResult);
		textResult.setColumns(10);
		
		JLabel lblNum = new JLabel("Número:");
		lblNum.setBounds(68, 43, 86, 14);
		contentPane.add(lblNum);
		
		JLabel lblResult = new JLabel("Resultado:");
		lblResult.setBounds(264, 43, 126, 14);
		contentPane.add(lblResult);
		
		ArrayList <Double> cadastrar = new ArrayList<>();
		
		JButton btnCad = new JButton("Cadastrar");
		btnCad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double numero = Double.valueOf(textNum.getText());
                cadastrar.add(numero);
			}
		});
		btnCad.setBounds(109, 145, 100, 23);
		contentPane.add(btnCad);
		
		JButton btnEx = new JButton("Exibir");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double par = Double.valueOf(0);
				
				for (int i = 0; i < cadastrar.size(); i++) {
					if(cadastrar.get(i) % 2 == 0 ) {
						par++;
					}
				}textResult.setText(par.toString());
				
			}
		});
		btnEx.setBounds(219, 145, 100, 23);
		contentPane.add(btnEx);
	
}
}
