package questao03;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textdataNas;
	private JTextField textCpf;
	private JTextField textMatricula;
	private JTextField textNomepro;
	private JTextField textDatapro;
	private JTextField textCpfpro;
	private JTextField textSiape;
	private JSeparator separator;
	private JButton btnCadAluno;
	private JButton btnCadProf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        
		
	
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(69, 53, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textdataNas = new JTextField();
		textdataNas.setBounds(69, 96, 86, 20);
		contentPane.add(textdataNas);
		textdataNas.setColumns(10);
		
		textCpf = new JTextField();
		textCpf.setBounds(69, 143, 86, 20);
		contentPane.add(textCpf);
		textCpf.setColumns(10);
		
		textMatricula = new JTextField();
		textMatricula.setText("");
		textMatricula.setBounds(69, 184, 86, 20);
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		
		textNomepro = new JTextField();
		textNomepro.setBounds(261, 53, 86, 20);
		contentPane.add(textNomepro);
		textNomepro.setColumns(10);
		
		textDatapro = new JTextField();
		textDatapro.setBounds(261, 96, 86, 20);
		contentPane.add(textDatapro);
		textDatapro.setColumns(10);
		
		textCpfpro = new JTextField();
		textCpfpro.setText("");
		textCpfpro.setBounds(261, 143, 86, 20);
		contentPane.add(textCpfpro);
		textCpfpro.setColumns(10);
		
		textSiape = new JTextField();
		textSiape.setBounds(261, 184, 86, 20);
		contentPane.add(textSiape);
		textSiape.setColumns(10);
		
		ArrayList<Aluno> CadAluno = new ArrayList<>();
		ArrayList<Professor> CadProf = new ArrayList<>();
		
		JButton btnAluno = new JButton("Exibir");
		btnAluno.setBounds(117, 227, 90, 23);
		contentPane.add(btnAluno);
		btnAluno.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, CadAluno.toString());
			}

		});
		
		
		
		
		
		JButton btnProf = new JButton("Exibir");
		btnProf.setBounds(345, 227, 89, 23);
		contentPane.add(btnProf);
		
		btnProf.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, CadProf.toString());

			}

		});
	
		
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setToolTipText("");
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBackground(new Color(0, 0, 0));
		separator_1.setBounds(217, 53, 10, 197);
		contentPane.add(separator_1);
		
		JLabel lblAluno = new JLabel("Aluno");
		lblAluno.setBounds(90, 25, 65, 17);
		contentPane.add(lblAluno);
		
		JLabel lblProf = new JLabel("Professor");
		lblProf.setBounds(284, 26, 86, 14);
		contentPane.add(lblProf);
		
		btnCadAluno = new JButton("Cadastrar");
		btnCadAluno.setBounds(6, 227, 101, 23);
		contentPane.add(btnCadAluno);
		
		
		
				
				
		btnCadAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				Aluno alunos = new Aluno();
				
				alunos.setNome(textNome.getText());
				alunos.setDataNasc(textdataNas.getText());
				alunos.setCpf (Long.valueOf(textCpf.getText()));
				alunos.setMatricula  (Long.valueOf(textMatricula.getText()));
				
				CadAluno.add(alunos);

						
			}
		
		});
		
		
				
		btnCadProf = new JButton("Cadastrar");
		btnCadProf.setBounds(234, 227, 101, 23);
		contentPane.add(btnCadProf);
		
		btnCadProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	    
	        	Professor profs = new Professor();
	        	
	        	profs.setNome(textNomepro.getText());
				profs.setDataNasc(textDatapro.getText());
				profs.setCpf (Long.valueOf(textCpfpro.getText()));
				profs.setSiape(Long.valueOf(textSiape.getText()));
				
				CadProf.add(profs);
	
		
			}	
		
	});
	}
}

		
	
	
