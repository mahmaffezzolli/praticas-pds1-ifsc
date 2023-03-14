package questao06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questao06 extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textN1;
	private JTextField textN2;
	private JTextField textN3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao06 frame = new Questao06();
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
	public Questao06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(172, 34, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textN1 = new JTextField();
		textN1.setBounds(10, 87, 86, 20);
		contentPane.add(textN1);
		textN1.setColumns(10);
		
		textN2 = new JTextField();
		textN2.setBounds(172, 87, 86, 20);
		contentPane.add(textN2);
		textN2.setColumns(10);
		
		textN3 = new JTextField();
		textN3.setBounds(338, 87, 86, 20);
		contentPane.add(textN3);
		textN3.setColumns(10);
		
		JLabel lblnNome = new JLabel("Nome do estudante: ");
		lblnNome.setBounds(168, 11, 101, 20);
		contentPane.add(lblnNome);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(10, 70, 46, 14);
		contentPane.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(172, 70, 46, 14);
		contentPane.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setBounds(338, 70, 46, 14);
		contentPane.add(lblNota3);
		
		JButton btncalcula = new JButton("CALCULAR");
		btncalcula.setFont(new Font("Tahoma", Font.BOLD, 12));
		btncalcula.setBounds(169, 161, 100, 20);
		contentPane.add(btncalcula);
		btncalcula.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
  
				float nota1 = Float.valueOf(textN1.getText());
				float nota2 = Float.valueOf(textN2.getText());
				float nota3 = Float.valueOf(textN3.getText());
				
				float media = (nota1+nota2+nota3)/3;
				
				JOptionPane.showMessageDialog(btncalcula, media);
			}
		});
	}
}
