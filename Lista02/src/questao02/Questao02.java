package questao02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class Questao02 extends JFrame {

	private JPanel contentPane;
	private JTextField textNum;
	private JTextField textMaior;
	private JTextField textMenor;
	private JLabel lblMaior;
	private JLabel lblMenor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao02 frame = new Questao02();
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
	public Questao02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNum = new JTextField();
		textNum.setBounds(80, 101, 86, 20);
		contentPane.add(textNum);
		textNum.setColumns(10);
		
		textMaior = new JTextField();
		textMaior.setEditable(false);
		textMaior.setBounds(240, 75, 86, 20);
		contentPane.add(textMaior);
		textMaior.setColumns(10);
		
		textMenor = new JTextField();
		textMenor.setEditable(false);
		textMenor.setBounds(240, 119, 86, 20);
		contentPane.add(textMenor);
		textMenor.setColumns(10);
		
		JLabel lblNum = new JLabel("Inserir Número");
		lblNum.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNum.setBounds(10, 76, 147, 18);
		contentPane.add(lblNum);
		
		lblMaior = new JLabel("Maior número");
		lblMaior.setBounds(240, 58, 141, 14);
		contentPane.add(lblMaior);
		
		lblMenor = new JLabel("Menor número");
		lblMenor.setBounds(240, 104, 120, 14);
		contentPane.add(lblMenor);
		
		
		ArrayList <Double> cadastrar = new ArrayList<>();
	
		
		JButton btnCad = new JButton("Cadastrar");
		btnCad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Double numero = Double.valueOf(textNum.getText());
                cadastrar.add(numero);
					
				
			}
	
		});
		btnCad.setBounds(80, 188, 89, 23);
		contentPane.add(btnCad);
		
		JButton btnExibe = new JButton("Exibir");
		btnExibe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double menor = Double.valueOf(Double.MAX_VALUE);
				Double maior = Double.valueOf(Double.MIN_VALUE);
				
				for (int i = 0; i < cadastrar.size(); i++) {
					if(cadastrar.get(i) > maior) {
						maior = cadastrar.get(i);
					}
					if(cadastrar.get(i) < menor) {
						menor = cadastrar.get(i);
					}
				}
				textMaior.setText(maior.toString());
				textMenor.setText(menor.toString());
			}

		});
		btnExibe.setBounds(237, 188, 89, 23);
		contentPane.add(btnExibe);
	}
}
